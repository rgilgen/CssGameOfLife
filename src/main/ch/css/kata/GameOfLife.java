package ch.css.kata;

/**
 * Hello world!
 */
public class GameOfLife {
    final Board board = new Board();

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.init(3, 3);
        System.out.println(gameOfLife);
    }

    public String init(int size, int aliveSize) {
        return board.init(size, aliveSize);
    }

    @Override
    public String toString() {
        return board.toString();
    }
}
