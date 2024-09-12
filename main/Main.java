package main;
import command.CommandManager;
import java.util.Scanner;
public class Main {
    public boolean running =true;
    public CommandManager commandManager = new CommandManager(this);

    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        String playerName;
       // int choice;

        System.out.println("Välkommen till Spelet!");
        System.out.println("Skriv ditt namn...");
        playerName=myScanner.nextLine();
        System.out.println("Hej "+playerName+"!");
        System.out.println("Du vaknar upp i ett rum. Utforska rummet.");
        // System.out.println("Här ser du en kista. Hur agerar du?");
        // System.out.println("Skriv en av följande kommandon: ");
        // System.out.println("Skriv 1 för `help`");
        // System.out.println("Skriv 2 för `search`");
        // System.out.println("Skriv 3 för `open`");
        // System.out.println("Skriv 4 för `pickup`");
        // System.out.println("Skriv 5 för `say`");

        Main main = new Main();

        while (main.running) {
            try {
                main.commandManager.readCommand();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        }


    //     choice = myScanner.nextInt();

    //   //   1.help
    // if (choice == 1) {
    //    System.out.println("1.help");
    //    System.out.println("Här ska visas information om alla kommandon");
    // }

    // //   2.search
    // else if (choice == 2) {
    //     System.out.println("I rummet hittar du en kista.");
    //     System.out.println("Hur tänker du agera? (1,3,4 eller 5`?)");
    // }  
    
    // //   3.open
    // else if (choice == 3) {
        
    // }        

    // //   4.pickup
    // else if (choice == 4) {
        
    // }  
    
    //  //   5.say
    //  else if (choice == 5) {
        
    //  }     

    //  else   {
    // System.out.println("Fel! Tryck 1,2,3,4 eller 5");  
        
    //  }     

    }
}

