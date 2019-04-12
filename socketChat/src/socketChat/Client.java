package socketChat;

import java.io.*; 
import java.net.*; 
import java.util.Scanner; 

public class Client {

	//-- notification
		private String notif = " *** ";

	//--  I/O
		private ObjectInputStream sInput;		// Lire la socket
		private ObjectOutputStream sOutput;		// ecrire la socket
		private Socket socket;					// socket object
		
		private String server, username;		// Server et pseudo
		private int port;						//port

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

//- Constructor 
		Client(String server, int port, String username) {
			this.server = server; // server adresse
			this.port = port; // port number
			this.username = username; // Pseudo
		}
		
//-- START le chat
		public boolean start() {
			// -- Essaye de se connecter au server
			try {
				socket = new Socket(server, port);
			} 
			//--- Error
			catch(Exception ec) {
				display("Erreur de connexion :" + ec);
				return false;
			}
			
			String msg = "Connection acceptée" + socket.getInetAddress() + ":" + socket.getPort();
			display(msg);
		
			try {
				sInput  = new ObjectInputStream(socket.getInputStream());
				sOutput = new ObjectOutputStream(socket.getOutputStream());
			
			}catch (IOException eIO) {
				display("Exception creating new Input/output Streams: " + eIO);
				return false;
			}

			// -- Création du Thread 
			new ListenFromServer().start();
			
			//Envoie le pseudo au server => String (chatMessage objets)
			try {
				sOutput.writeObject(username);
			}catch (IOException eIO) {
				display("Exception loging : " + eIO);
				disconnect();
				return false;
			}
			// check OK
			return true;
		}

	//-- Affiche le message
		private void display(String msg) {

			System.out.println(msg);
			
		}
		
		
	//-- Envoyer un message au server
		void sendMessage(chatMessage msg) {
			try {
				sOutput.writeObject(msg);
			}
			catch(IOException e) {
				display("Exception : " + e);
			}
		}

		
	//-- Close Input/ Output et deconnexion
		private void disconnect() {
			try { 
				if(sInput != null) sInput.close();
			}
			catch(Exception e) {}
			try {
				if(sOutput != null) sOutput.close();
			}
			catch(Exception e) {}
	        try{
				if(socket != null) socket.close();
			}
			catch(Exception e) {}
				
		}
	
		
		
	//-- Start le client 
		public static void main(String[] args) {
			// --- Valeur par defaut -
			int portNumber = 5000;
			String serverAddress = "localhost";
			String userName = "Anonymous";
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Entrer un pseudo : ");
			userName = scan.nextLine();

			switch(args.length) {
				case 3:
					// for > javac Client username portNumber serverAddr
					serverAddress = args[2];
				case 2:
					// for > javac Client username portNumber
					try {
						portNumber = Integer.parseInt(args[1]);
					}
					catch(Exception e) {
						System.out.println("Port Numer est invalid.");
						System.out.println("Usage is: > java Client [username] [portNumber] [serverAddress]");
						return;
					}
				case 1: 
					// for > javac Client username
					userName = args[0];
				case 0:
					// for > java Client
					break;
				// si le nombre des arguments sont invalide
				default:
					System.out.println("Usage is: > java Client [username] [portNumber] [serverAddress]");
				return;
			}
			//-- Création du client objet
			Client client = new Client(serverAddress, portNumber, userName);
			//-- Essaie de connexion au server et retun si pas de connexion
			if(!client.start())
				return;
			
			System.out.println("\nHello.! Bienvenue sur la chatroom...");
			System.out.println("Instructions:");
			System.out.println("1. Taper le message pour envoyer la diffusion à tous les clients actifs");
			System.out.println("2. Type '@username <space> votre message' sans les guillemets pour envoyer un message au client souhaité");
			System.out.println("3. Type 'WHOIS 'sans guillemets pour connaitre la liste des utilistateurs actifs");
			System.out.println("4. Type 'LOGOUT' sans guillemets pour vous déconnecter du serveur");
			
			
		// -- Boucle => input de l'user
			while(true) {
				System.out.print("> ");
				// --- Les les messages
				String msg = scan.nextLine();
				//-- Logout si LOGOUT
				if(msg.equalsIgnoreCase("LOGOUT")) {
					client.sendMessage(new chatMessage(chatMessage.LOGOUT, ""));
					break;
				}
				//-- Message check qui sont present dans la chatroom
				else if(msg.equalsIgnoreCase("WHOISIN")) {
					client.sendMessage(new chatMessage(chatMessage.WHOISIN, ""));				
				}
			
				else {
					client.sendMessage(new chatMessage(chatMessage.MESSAGE, msg));
				}
			}
			// close 
			scan.close();
			// Client ok = deconnexion
			client.disconnect();	
		}

	
//-- Classe attends les message du server / Thread avec la méthode Run dedans
		class ListenFromServer extends Thread {

			public void run() {
				while(true) {
					try {
						//--- lit le message de l'iput dataStream
						String msg = (String) sInput.readObject();
						System.out.println(msg);
						System.out.print("> ");
					}
					catch(IOException e) {
						display(notif + "Server est fermés " + e + notif);
						break;
					}
					catch(ClassNotFoundException e2) {
					}
				}
			}
		}

} 
	



