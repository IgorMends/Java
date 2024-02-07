package Terminal;
import Controller.phases.AccountController;
import Controller.phases.MainPhase;
import DataBase.AccountsDB;

public class Main {
    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        AccountsDB accountsDB = new AccountsDB();
        AccountController accountController = new AccountController(accountsDB);
        MainPhase mainPhase = new MainPhase(terminal, accountController);
        mainPhase.entryPage();
    }
}
