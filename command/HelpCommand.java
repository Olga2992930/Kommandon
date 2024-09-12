package command;

import main.Main;

public class HelpCommand {
    public Main main;

    public HelpCommand(Main main) {
        this.main = main;
    }

    public void run(String[] args) {
        System.out.println("Kommandon:");
        System.out.println(" 1.help ");
        System.out.println(" 2.search");
        System.out.println(" 3.open");
        System.out.println(" 4.pick up");
        System.out.println(" 5.say");
        
    }
}
