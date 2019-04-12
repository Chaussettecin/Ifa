import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	private ServerSocket serverSocket; 
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	
	public MyServer() throws IOException {
		System.out.println("Server Launch");
		serverSocket = new ServerSocket(5000);
		// --- on attend la connexion d'un client
		clientSocket = serverSocket.accept(); 
		// --- On recup le flux d'entree et sortie du socket client
		out = new PrintWriter (clientSocket.getOutputStream(), true);
		in = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));
		
		// -- on attend un message du client
		String msg = in.readLine();
		System.out.println("Server - Message reçu :" + msg);
		
		System.out.println("Server - message envoyés");
		out.println("Coucou");
		
		//-- Fermer les ressources
		try {
			in.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException e) {
			System.out.println("IO Exception throw on Server END");
		}
	}
	public static void main(String[] args) {
		try {
			MyServer server = new MyServer();
			
		} catch (IOException e) {
			System.out.println("IO Exception throw on Server");

	}
	}
}


