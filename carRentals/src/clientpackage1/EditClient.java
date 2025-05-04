//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package clientpackage;
import java.util.*;

public class EditClient {
    static void editClient() {
    	Scanner kb = new Scanner(System.in);
    	System.out.println("Please enter client's number: ");
    	int clientsNumber = kb.nextInt();
    	kb.nextLine();
    	if(ClientsList.clientsList[clientsNumber] !=null) {
	    	System.out.println("Please enter client's new first name: ");
	    	String firstName = kb.nextLine();
	    	System.out.println("Please enter client's new last name: ");
	    	String lastName = kb.nextLine();
	    	System.out.println("Please enter client's new adress: ");
	    	String adress = kb.nextLine();
	    	ClientsList.clientsList[clientsNumber] = new Client(firstName,lastName,adress);
	    	System.out.println("Client number "+ clientsNumber + " has been updated.");
    	}
    	else
    		System.out.println("Can't edit an unexistant client,please try a different one!");
    }
}