package Controller.phases;
import Terminal.Terminal;

public class MainPhase {

    private final Terminal terminal;

    public MainPhase(Terminal terminal){
        this.terminal = terminal;
    }

    public void entryPage(){


        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^                                    ^");
        System.out.println("^              ION BANK              ^");
        System.out.println("^                                    ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^         Selecione uma Opção        ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^   [C]   ^          Entrar          ^");
        System.out.println("^   [X]   ^           Sair           ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        String choice = terminal.phraseSet("Digite uma opção: ");
        choice = choice.toUpperCase();

        switch (choice){
            case "C":
                terminal.clearTerminal();
                choicePage();
                break;
            case "X":
                System.out.println();
                terminal.phrasePrint("Obrigado pelo uso de nosso programa!");
                System.exit(0);
                break;
        }
    }

    public void choicePage(){
        RegisterPhase registerPhase = new RegisterPhase(terminal);

        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^         Selecione uma Opção        ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^   [E]   ^      Entrar em conta     ^");
        System.out.println("^   [N]   ^      Cadastrar conta     ^");
        System.out.println("^   [X]   ^      Voltar ao menu      ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        String choice = terminal.phraseSet("Digite uma opção: ");
        choice = choice.toUpperCase();

        switch (choice) {
            case "E":

                break;
            case "N":
                terminal.clearTerminal();
                registerPhase.registerPage();
                break;
            case "X":
                terminal.clearTerminal();
                entryPage();
                break;
        }
    }
}
