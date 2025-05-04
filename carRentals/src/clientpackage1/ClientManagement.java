//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package clientpackage;
import java.util.Scanner;


public class ClientManagement {
		
    public static void clientManagement(){
    	Scanner keyboard = new Scanner(System.in);
		int clientAction;
		do {
			//Ask user to enter the number associated to what he wants to execute
			System.out.println("""
					
					Vehicle Management Menu:
						1.Add a Client
						2.Edit a Client
						3.Delete a client
						4.Back
					Enter your choice: """);
			clientAction = keyboard.nextInt();
			keyboard.nextLine();
			//Create a switch to execute what the user entered
			switch(clientAction) {
			
				//Add a client
				case 1:{
					AddClient.addClient();
					break;
				}
				
				// Edit a client 
				case 2:{
					EditClient.editClient();
					break;
				}
				
				//Remove a client

				case 3:{
					RemoveClient.removeClient();

					break;
				}
				
				//Back
				case 4:{
					break;
				}
				default:{
					System.out.println("Your input is invalid,please try again.");
					break;
				}
			
			}
		}while(clientAction != 4);
	}
	
	
}
