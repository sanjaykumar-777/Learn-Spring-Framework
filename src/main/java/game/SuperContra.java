package game;

public class SuperContra implements GameConsole{
    @Override
    public void up() {
        System.out.println("Contra jumped Up");
    }

    @Override
    public void down() {
        System.out.println("Contra jumped Down");
    }

    @Override
    public void left() {
        System.out.println("Contra jumped Left");
    }

    @Override
    public void right() {
        System.out.println("Contra jumped Right");
    }
}
