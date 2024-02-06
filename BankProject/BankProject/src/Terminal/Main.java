package Terminal;
import Controller.phases.MainPhase;
import Controller.phases.RegisterPhase;

public class Main {
    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        MainPhase mainPhase = new MainPhase(terminal);
        RegisterPhase registerPhase = new RegisterPhase(terminal, mainPhase);
        registerPhase.registerPage();
    }
}
