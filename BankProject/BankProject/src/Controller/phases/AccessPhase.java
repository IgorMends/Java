package Controller.phases;
import Terminal.Terminal;

public class AccessPhase {

    private final Terminal terminal;

    public AccessPhase(Terminal terminal){
        this.terminal = terminal;
    }

    public void accessPage(){
        terminal.clearTerminal();


    }
}
