package Controller.phases;
import Terminal.Terminal;

public class MainPhase {

    private final Terminal terminal;

    public MainPhase(Terminal terminal){
        this.terminal = terminal;
    }

    public void choicePage(){
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^                                    ^");
        System.out.println("^              ION BANK              ^");
        System.out.println("^                                    ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^         Selecione uma Opção        ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^   [C]   ^         Cadastrar        ^");
        System.out.println("^   [X]   ^           Sair           ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        terminal.phraseSet("Digite uma opção: ");

    }
}
