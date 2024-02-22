package Terminal;

import java.util.Scanner;

public class Terminal {

    public String phraseSet(String phrase){
        Scanner scanner = new Scanner(System.in);
        System.out.format("-->> %s", phrase);
        return scanner.nextLine();
    }

    public String phraseSet(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String phraseSetline(String phrase){
        Scanner scanner = new Scanner(System.in);
        System.out.format("-->> %s", phrase);
        return scanner.next();
    }

    public double doubleSet(String phrase){
        Scanner scanner = new Scanner(System.in);
        System.out.format("-->> %s", phrase);
        return scanner.nextDouble();
    }

    public void phrasePrint(String phrase){
        System.out.format("-->> %s\n", phrase);
    }

    public void printError(String phrase){
        System.out.format(">>ERRO<< --> %s", phrase);
    }

    public void clearTerminal(){
        for(int i = 0; i <= 100; i++){
            System.out.println();
        }
    }

}
