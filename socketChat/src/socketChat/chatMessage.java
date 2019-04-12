package socketChat;

import java.io.Serializable;

public class chatMessage implements Serializable {

	//--- Diffrent type envoyer pr le client
	//--- WhoIsin => recoit la liste des user connectés
	//--- MESSAGE => Message string
	//--- LOGOUT  => Deconnexion au server
	
	static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
	private int type;
	private String message;
	
//--- Constructor -
	chatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}
	
	int getType() {
		return type;
	}

	String getMessage() {
		return message;
	}

}
