package game;

import org.springframework.stereotype.Component;


public class Pacman implements GameConsole{
    @Override
    public void up() {
        System.out.println("Pacman moved Up");
    }

    @Override
    public void down() {
        System.out.println("Pacman moved Down");
    }

    @Override
    public void left() {
        System.out.println("Pacman moved Left");
    }

    @Override
    public void right() {
        System.out.println("Pacman moved Right");
    }
}
