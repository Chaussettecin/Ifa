package socketChat;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Server {

//--- ID unique pour chaque connection
	private static int uniqueId;
//-- Arraylist recupére les client
	private ArrayList<ClientThread> al;
//-- Affiche le temps
	private SimpleDateFormat sdf;
//--- Port --
	private int port;
//-- Check si le server tourne
	private boolean keepGoing;
//-- notification
	private String notif = " *** ";
	

	
//-- Constructor recoit le port et lit les paramètres de connexion	
	public Server(int port) {
		this.port = port;
	
		sdf = new SimpleDateFormat("HH:mm:ss");
		al = new ArrayList<ClientThread>();
	}
	
	
	public void start() {
		keepGoing = true;
		//-- Creation d'une Socket server et attend les requetes de connection
		try {
			//-- Socket utilisées par le serveur
			ServerSocket serverSocket = new ServerSocket(port);
			
		//-- Boucle qui attend pour les connexions, si le server est ok
			while(keepGoing) {
				display("Le server attend le client sur le port " + port + ".");
				
			//-- Connexion acceptée
				Socket socket = serverSocket.accept();
			//-- Stop sur le server est down
				if(!keepGoing)
					break;
			//-- Si le client est connecté il créer un thread
				ClientThread t = new ClientThread(socket);
			//-- Ajoute les clients dans une arraylist
				al.add(t);
				t.start();
			}
			//-- Essaye de close le server
			try {
				serverSocket.close();
				for(int i = 0; i < al.size(); ++i) {
					ClientThread tc = al.get(i);
					try {
					// Close all
					tc.sInput.close();
					tc.sOutput.close();
					tc.socket.close();
					}
					catch(IOException ioE) {
					}
				}
			}
			catch(Exception e) {
				display("Exception Server et Client sont fermés : " + e);
			}
		}
		catch (IOException e) {
            String msg = sdf.format(new Date()) + " Exception new ServerSocket: " + e + "\n";
			display(msg);
		}
	}
	

//--- Stop => Server
	protected void stop() {
		keepGoing = false;
		try {
			new Socket("localhost", port);
		}
		catch(Exception e) {
		}
	}
	
//--- Affichage
	private void display(String msg) {
		String time = sdf.format(new Date()) + " " + msg;
		System.out.println(time);
	}
	
// -- Transmet les messages au client
	private synchronized boolean broadcast(String message) {
		//-- Ajoute le time aux messages
		String time = sdf.format(new Date());
		
		//-- Check si le message est privé 
		String[] w = message.split(" ",3);
		
		boolean isPrivate = false;
		if(w[1].charAt(0)=='@') 
			isPrivate=true;
		
		
	//-- Si message privé, envoyé seulement à un ultiser 
		if(isPrivate==true) {
			String tocheck=w[1].substring(1, w[1].length());
			
			message=w[0]+w[2];
			String messageLf = time + " " + message + "\n";
			boolean found=false;
			
		//-- boucle qui inverse l'ordre pour trouver l'user
			for(int y=al.size(); --y>=0;){
				
				ClientThread ct1=al.get(y);
				String check=ct1.getUsername();
				
				if(check.equals(tocheck)) {
				//--- essaye d'ecrire au client / si impossible = supprimé de la liste
					if(!ct1.writeMsg(messageLf)) {
						al.remove(y);
						display("Client deconnexion " + ct1.username + " supprimer de la liste.");
					}
					// User trouver = Mess delivré
					found=true;
					break;
				}
				
			}
			// Si user n'est pas trouver = retourne faux
			if(found!=true)
			{
				return false; 
			}
		} else  {
			String messageLf = time + " " + message + "\n";
		//-- Affiche le mesage 
			System.out.print(messageLf);
			
		
		//--- deco de l'user => il est alors supprimé de l'arraylist
			for(int i = al.size(); --i >= 0;) {
				ClientThread ct = al.get(i);
			
				if(!ct.writeMsg(messageLf)) {
					al.remove(i);
					display("Deconnexion client" + ct.username + " suprimé de la liste.");
				}
			}
		}
		return true;
		
	}

//-- Si client envoie LOGOUT => exit
	synchronized void remove(int id) {
		
		String disconnectedClient = "";
		//--Scan l'array list ... Check id
		for(int i = 0; i < al.size(); ++i) {
			ClientThread ct = al.get(i);
			//--Si trouver = remove
			if(ct.id == id) {
				disconnectedClient = ct.getUsername();
				al.remove(i);
				break;
			}
		}
		broadcast(notif + disconnectedClient + " a quitté le chat." + notif);
	}
	

// --- Run => portNumber (si le port est non specififé utilise 5000 par défaut
	public static void main(String[] args) {
		//-- Start Server sur le port 5000 
		int portNumber = 5000;
		switch(args.length) {
			case 1:
				try {
					portNumber = Integer.parseInt(args[0]);
				}
				catch(Exception e) {
					System.out.println("Num de port Invalide.");
					System.out.println("Utilisation est : > java Server [portNumber]");
					return;
				}
			case 0:
				break;
			default:
				System.out.println("Utilisation est : > java Server [portNumber]");
				return;
				
		}
		//-- Création object Server => Start
		Server server = new Server(portNumber);
		server.start();
	}


	class ClientThread extends Thread {
		//-- Socket  => Mess du client -
		Socket socket;
		ObjectInputStream sInput;
		ObjectOutputStream sOutput;
		//-- id = Unique
		int id;
		// Pseudo du client
		String username;
		//Message
		chatMessage cm;
		// times
		String date;

	//-- Constructor
		ClientThread(Socket socket) {
	
			id = ++uniqueId;
			this.socket = socket;
			
			System.out.println("Thread essaye de créer un objet Input/Ouput Stream");
			try {
				sOutput = new ObjectOutputStream(socket.getOutputStream());
				sInput  = new ObjectInputStream(socket.getInputStream());
				// Lis le pseudo -
				username = (String) sInput.readObject();
				broadcast(notif + username + " a joint le chat." + notif);
			}
			
			catch (IOException e) {
				display("Exception creating new Input/output Streams: " + e);
				return;
			}
			catch (ClassNotFoundException e) {
			}
            date = new Date().toString() + "\n";
		}
		
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

//-- Boucle et lit et transmet le message
		public void run() {
		
			boolean keepGoing = true;
			while(keepGoing) {
				// lecture
				try {
					cm = (chatMessage) sInput.readObject();
				}
				catch (IOException e) {
					display(username + " Exception reading Streams: " + e);
					break;				
				}
				catch(ClassNotFoundException e2) {
					break;
				}
				//-- message de chatMesage objet recu
				String message = cm.getMessage();

				
				switch(cm.getType()) {

				case chatMessage.MESSAGE:
					boolean confirmation =  broadcast(username + ": " + message);
					if(confirmation==false){
						String msg = notif + "Desolé. Aucun utilisateur exitant." + notif;
						writeMsg(msg);
					}
					break;
				case chatMessage.LOGOUT:
					display(username + " deconnexion avec LOGOUT msg.");
					keepGoing = false;
					break;
				case chatMessage.WHOISIN:
					writeMsg("Liste des participants au Chat " + sdf.format(new Date()) + "\n");
				//--- Envoie la liste des personnes actives
					for(int i = 0; i < al.size(); ++i) {
						ClientThread ct = al.get(i);
						writeMsg((i+1) + ") " + ct.username + " depuis " + ct.date);
					}
					break;
				}
			}
	//--- Si on sort de la boucle = Deconnection est suppression de l'user dans l'arraylist
			remove(id);
			close();
		}
		
		//--- close 
		private void close() {
			try {
				if(sOutput != null) sOutput.close();
			}
			catch(Exception e) {}
			try {
				if(sInput != null) sInput.close();
			}
			catch(Exception e) {};
			try {
				if(socket != null) socket.close();
			}
			catch (Exception e) {}
		}
	
		private boolean writeMsg(String msg) {
			//--- Si client est connecté envoie mess envoyer
			if(!socket.isConnected()) {
				close();
				return false;
			}
			//-- Ecrire le msg dans le stream
			try {
				sOutput.writeObject(msg);
			}
			//-- Si Error = l'utisateur est informer
			catch(IOException e) {
				display(notif + "Erreur d'envoie du message " + username + notif);
				display(e.toString());
			}
			return true;
		}
	}
	
}