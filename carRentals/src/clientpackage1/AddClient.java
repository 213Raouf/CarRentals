//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package clientpackage;
import java.util.*;

public class AddClient {
    static void addClient() {
    	Scanner kb = new Scanner(System.in);
    	System.out.println("Please enter client's first name: ");
    	String firstName = kb.nextLine();
    	System.out.println("Please enter client's last name: ");
    	String lastName = kb.nextLine();
    	System.out.println("Please enter client's adress: ");
    	String adress = kb.nextLine();
    	ClientsList.clientsList[ClientsList.clientCount] = new Client(firstName,lastName,adress);
    	System.out.println("Client number "+ ClientsList.clientCount++ + " has been created.");
    }

}
