package ch.css.kata;

public class Cell {
    private final boolean alive;
    private final Point coordinates;

    public Cell(boolean alive, Point coordinates) {
        this.alive = alive;
        this.coordinates = coordinates;
    }
    @Override
    public String toString() {
        return alive ? "x" : "o";
    }
}
