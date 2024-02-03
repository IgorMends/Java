package Controller;
import Controller.phases.MainPhase;
import Terminal.Terminal;

public class Main {
    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        MainPhase mainPhase = new MainPhase(terminal);
    }
}
