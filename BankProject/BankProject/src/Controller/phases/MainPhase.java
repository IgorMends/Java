package Controller.phases;
import DataBase.Account;
import DataBase.AccountsDB;
import Terminal.Terminal;

public class MainPhase {

    private final Terminal terminal;
    private final AccountController accountController;
    public static final String LIST_FORMAT = "|%1$-10s|%2$-15s|%3$-15s|%4$-15s|%5$-15s|\n";

    public MainPhase(Terminal terminal, AccountController accountController){
        this.terminal = terminal;
        this.accountController = accountController;
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
                terminal.clearTerminal();
                entryAccount();
                break;
            case "N":
                terminal.clearTerminal();
                registerPage();
                break;
            case "X":
                terminal.clearTerminal();
                entryPage();
                break;
        }
    }

    public void registerPage(){

        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^                                    ^");
        System.out.println("^              Register              ^");
        System.out.println("^                                    ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        Account account = new Account();

        account.setName(terminal.phraseSet("Nome: "));
        account.setPassword(terminal.phraseSet("Senha: "));
        account.setAge(terminal.doubleSet("Idade: "));
        account.setBallance(terminal.doubleSet("Saldo inicial: "));

        System.out.println();
        System.out.println();

        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^         Selecione uma Opção        ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^   [E]   ^          Salvar          ^");
        System.out.println("^   [X]   ^          Voltar          ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        String choice = terminal.phraseSetline("Digite uma Opção: ");
        choice = choice.toUpperCase();

        switch(choice){
            case "E":
                accountController.create(account);
                terminal.clearTerminal();
                break;
            case "X":
                terminal.clearTerminal();
                break;
        }
        choicePage();
    }

    public void entryAccount(){
        terminal.clearTerminal();

        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        System.out.println("^                                    ^");
        System.out.println("^                Login               ^");
        System.out.println("^                                    ^");
        System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        String name = terminal.phraseSet("Usuário: ");

        Account account = accountController.getByName(name);
        if(account == null){
            terminal.phrasePrint("Esta conta não existe");
            terminal.phrasePrint("Pressione quaquer tecla para voltar ao menu!");
            String back = terminal.phraseSet();
            terminal.clearTerminal();
            choicePage();
        }
        else{
            String password = terminal.phraseSet("Senha: ");
            if(account.getPassword().equals(password)){
                terminal.clearTerminal();
                System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
                System.out.println("^                                    ^");
                System.out.printf("^                 %s                 ^", account.getName());
                System.out.println("^                                    ^");
                System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
                terminal.phrasePrint("Nome: " + account.getName());
                terminal.phrasePrint("Idade: " + account.getAge());
                terminal.phrasePrint("Saldo: " + account.getBallance());

                terminal.phrasePrint("Pressione quaquer tecla para voltar ao menu!");
                terminal.clearTerminal();
                String back = terminal.phraseSet();
                choicePage();
            }
            else{
                terminal.phrasePrint("Senha incorreta!");
                terminal.phrasePrint("Pressione quaquer tecla para voltar ao menu!");
                String back = terminal.phraseSet();
                terminal.clearTerminal();
                choicePage();
            }
        }

    }
}
