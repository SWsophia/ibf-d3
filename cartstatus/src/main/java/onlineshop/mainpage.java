package onlineshop;

import java.util.Scanner;

public class mainpage 
{
    
    public static void main(String[] args) {

        readUserCmd reader = new readUserCmd();

        System.out.println("Welcome to your shopping cart");
        System.out.println("Please use command <list> or <add> or <delete> ");

        //check user's input;
        Scanner input = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please key in your action: ");

        String userCmd = input.nextLine(); // Read user input
        System.out.println("Your input is: " + userCmd);

        while (!"add".equals(userCmd) && !"list".equals(userCmd) && !"delete".equals(userCmd))
        {
            System.out.println("Please key in the valid command");
            input.close();
            return;
        }

        /* if ("add".equals(userCmd)) {

        }

        if ("delete".equals(userCmd)){

        } */

        if ("list".equals(userCmd)){
            reader.cmdList(userCmd);
            System.out.println("Do you want to add more?");

        }

        input.close();
        System.out.println("Continue shopping or proceed to payment?");
        
    }
}
