package Controller.phases;

import DataBase.Account;
import DataBase.AccountsDB;

public class AccountController {

    private final AccountsDB accountsDB;

    public AccountController(AccountsDB accountsDB){
        this.accountsDB = accountsDB;
    }

    public void create(Account account){
        //validator
        accountsDB.save(account);
    }
}
