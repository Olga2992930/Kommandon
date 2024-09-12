package command;
import java.util.Scanner; 
import main.Main;

public class CommandManager {
    public Scanner commandScanner;
    private HelpCommand helpCommand;
    private StopCommand stopCommand;

    public CommandManager(Main main) {
        helpCommand = new HelpCommand(main);
        stopCommand = new StopCommand(main);
        commandScanner = new Scanner(System.in);
    }

    public void readCommand() {
        String input = commandScanner.nextLine();
       

        if (input.isBlank()) {
            throw new IllegalArgumentException("Kommandot får inte vara tomt.");
        }

        String[] args = input.split("");
        if (args.length == 0) {
            throw new IllegalArgumentException("Kommandot får inte vara tomt.");
        }

        String command = args[0];

    
        if (command.equalsIgnoreCase("help")) {
            helpCommand.run(args);
        } else if (command.equalsIgnoreCase("stop")) {
            stopCommand.run(args);
        } else {
            throw new IllegalArgumentException("`"+ command + "`" +" är inte ett commando. Skriv help...");
            
         }

        }
    }
    



