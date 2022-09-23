package ch.css.kata;

import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class GameOfLife {
    final Board board = new Board();

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.init(3, Collections.emptyList());
        System.out.println(gameOfLife);
    }

    public String init(int size, List<Point> aliveSize) {
        return board.init(size, aliveSize);
    }

    @Override
    public String toString() {
        return board.toString();
    }
}
