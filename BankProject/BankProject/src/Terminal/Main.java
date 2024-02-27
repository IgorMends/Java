package Terminal;
import Controller.phases.AccountController;
import DataBase.AccountsDB;
import Validation.Validator;

public class Main {
    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        Validator validator = new Validator(terminal);
        AccountsDB accountsDB = new AccountsDB();
        AccountController accountController = new AccountController(accountsDB);
        MainPhase mainPhase = new MainPhase(terminal, accountController, validator);
        mainPhase.entryPage();
    }
}
