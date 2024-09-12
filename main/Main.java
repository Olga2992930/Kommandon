package main;
import command.CommandManager;

public class Main {
    public boolean running = true;
    public CommandManager commandManager = new CommandManager(this);

    
    public static void main(String[] args) {
        System.out.println("Välkommen till Spelet!");
        System.out.println("Du vaknar upp i ett öde hus. För att ta dig ut behöver du hitta 3 nycklar som ligger gömda.");
        System.out.println("I huset finns det olika objekt att söka igenom för att hitta nycklarna.");
        System.out.println("Skriv 'help' för att visa de olika kommandona.");

        Main main = new Main();

        while (main.running) {
            try {
                main.commandManager.readCommand();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        
    }
    
}
/*Steg 1. Printa ut text
Du vaknar upp i ett öde hus. För att ta dig ut behöver du hitta 3 nycklar som ligger gömda. 
I huset finns det olika objekt att söka igenom för att hitta nycklarna. 
Skriv 'help' för att visa de olika kommandona.
 
 
Steg 2. Help
Funktion som printar ut text om vilka kommandon som finns.
 
Steg 3. - Search
Funktion som printar ut 5 olika platser (skåp, påse, kista, ugn, vindslucka t.ex.)



Killarnas del

Steg 4. Open
 
Här ska man kunna skriva “Open”. När man skrivit open har vi en funktion som ser om det finns en nyckel där (true/false
 
(Sen kan man skriva search igen)
 
Steg 5.  Pick up

Här tar man nyckeln. skal sparas.

Steg 6. Gåta 

När det finns en nyckel kvar så ska man få upp en gåta. Hur görs denna? Ja och nej svar?*/