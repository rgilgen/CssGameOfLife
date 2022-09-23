package ch.css.kata;

/**
 * Hello world!
 */
public class GameOfLife {
    final Board board = new Board();

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String init(int size) {
        return board.init(size);
    }
}
