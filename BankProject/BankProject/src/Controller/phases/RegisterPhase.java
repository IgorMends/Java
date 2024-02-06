package Controller.phases;

import Terminal.Terminal;

public class RegisterPhase {

    private final Terminal terminal;

    public RegisterPhase(Terminal terminal){
        this.terminal = terminal;
    }

    public void registerPage(){
        terminal.clearTerminal();
        MainPhase mainPhase = new MainPhase(terminal);

        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^                                    ^");
        System.out.println("^              Register              ^");
        System.out.println("^                                    ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        String name = terminal.phraseSet("Nome: ");
        String password = terminal.phraseSet("Senha: ");
        double age = terminal.doubleSet("Idade: ");
        double balance = terminal.doubleSet("Saldo inicial: ");

        System.out.println();
        System.out.println();

        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^         Selecione uma Opção        ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^   [E]   ^          Salvar          ^");
        System.out.println("^   [X]   ^          Voltar          ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        String choice = terminal.phraseSet("Digite uma Opção: ");
        choice = choice.toUpperCase();

        switch(choice){
            case "E":

                break;
            case "X":
                terminal.clearTerminal();
                mainPhase.choicePage();
                break;
        }
    }
}
