import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

		private Socket clientSocket;
		private PrintWriter out; 
		private BufferedReader in; 
		
		public MyClient(String msg) throws UnknownHostException, IOException {
			//j'esaye de me connecter
			clientSocket = new Socket ("127.0.0.1", 5000);
			out = new PrintWriter (clientSocket.getOutputStream(), true);
			
			System.out.println("Client - on envoie :" + msg);
			// J'utilise le flux de sortie pour envoyer un mess au server
			out.println(msg);
			
			String reponse = in.readLine();
			System.out.println("message reçu" + reponse);
			
			out.close();
			clientSocket.close();
		}
		
		public static void main(String[] args) {
			try {
				MyClient client  = new MyClient("Bonjour le serveur");
			
			} catch (IOException e) {
				System.out.println("Probleme chez le client");
			}
		}	
}
