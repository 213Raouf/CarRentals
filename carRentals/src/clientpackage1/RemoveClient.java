//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package clientpackage;
import java.util.*;

public class RemoveClient {
	static void removeClient() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter client's number: ");
		int clientNumber = kb.nextInt();
		kb.nextLine();
    	if(ClientsList.clientsList[clientNumber] !=null) {
    		System.out.println("Client "+ ClientsList.clientsList[clientNumber].getFirstName()+
    			ClientsList.clientsList[clientNumber].getLastName() +" removed successfuly!");
    		ClientsList.clientsList[clientNumber] = null;
    	
    	}
    	else
    		System.out.println("Can't remove an unexistant client.");
	}
}
