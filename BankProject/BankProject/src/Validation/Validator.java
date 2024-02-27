package Validation;

import Terminal.Terminal;

public class Validator {

    private final Terminal terminal;

    public Validator(Terminal terminal){
        this.terminal = terminal;
    }

    public String choiceValidator(String a, String b, String option){
        while(!(option.equalsIgnoreCase(a)) && !(option.equalsIgnoreCase(b))){
            terminal.skipLine();
            terminal.phrasePrint("Escolha uma opção válida! Tente novamente");
            option = terminal.phraseSet("Digite uma opção: ");
        }
        return option;
    }

    public String choiceValidator(String a, String b, String c, String option){
        while(!(option.equalsIgnoreCase(a)) && !(option.equalsIgnoreCase(b)) && !(option.equalsIgnoreCase(c))){
            terminal.skipLine();
            terminal.phrasePrint("Escolha uma opção válida! Tente novamente");
            option = terminal.phraseSet("Digite uma opção: ");
        }
        return option;
    }
}
