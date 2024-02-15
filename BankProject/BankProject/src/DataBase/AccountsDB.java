package DataBase;

import java.util.Arrays;

public class AccountsDB {

    private Account[] database = new Account[0];

    public void save(Account account){
        database = Arrays.copyOf(database, database.length + 1);
        database[database.length - 1] = account;
    }

    public Account[] getDatabase(){
        return database;
    }

    public Account getByName(String name){
        for (Account account:database) {
            if(account.getName().equalsIgnoreCase(name)){
                return account;
            }
        }
        return null;
    }


}
