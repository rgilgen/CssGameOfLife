package ch.css.kata;

public class Cell {
    private final boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }
    @Override
    public String toString() {
        return alive ? "x" : "o";
    }
}
