package Terminal;

import java.util.Scanner;

public class Terminal {

    private static final Scanner SC = new Scanner(System.in);

    public String phraseSet(String phrase){
        System.out.format("-->> %s", phrase);
        return SC.nextLine();
    }

    public void phrasePrint(String phrase){
        System.out.format("-->> %s\n", phrase);
    }

    public void printError(String phrase){
        System.out.format(">>ERRO<< --> %s", phrase);
    }

}
