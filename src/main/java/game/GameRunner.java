package game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
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
