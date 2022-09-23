package ch.css.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Board {
    private final List<List<Cell>> cells = new ArrayList<>();

    public String init(int size, int aliveSize) {
        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            cells.add(createRow(size, false));
        }
        cells.set(0, createCellsAlive(aliveSize));
        return toString();
    }

    private List<Cell> createCellsAlive(int aliveSize) {
        return createRow(aliveSize, true);
    }

    private List<Cell> createRow(int columns, boolean alive) {
        List<Cell> row = new ArrayList<>();
        for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
            row.add(new Cell(alive));
        }
        return row;
    }

    @Override
    public String toString() {
        return cells.stream()
                .flatMap(getMapper())
                .collect(Collectors.joining());
    }

    private static Function<List<Cell>, Stream<? extends String>> getMapper() {
        return e -> e.stream()
                .map(Cell::toString);
    }
}
