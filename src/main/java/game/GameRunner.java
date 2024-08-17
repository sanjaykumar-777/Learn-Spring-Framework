package game;

public class GameRunner {

    private GameConsole gameConsole;
    public GameRunner(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    public void run(){
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }
}
