package game;

import org.springframework.stereotype.Component;
@Component
public class Mario implements GameConsole {
    @Override
    public void up() {
        System.out.println("Mario jumped Up");
    }

    @Override
    public void down() {
        System.out.println("Mario jumped Down");
    }

    @Override
    public void left() {
        System.out.println("Mario jumped Left");
    }


    @Override
    public void right() {
        System.out.println("Mario jumped Right");
    }
}
