package ch.css.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Board {
    private final List<List<Cell>> cells = new ArrayList<>();

    public String init(int size, List<Point> aliveCoordinates ) {
        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            cells.add(createRow(size, rowIndex));
        }
        setAliveCells(aliveCoordinates);
        return toString();
    }

    private void setAliveCells(List<Point> aliveCoordinates) {
        aliveCoordinates.forEach(c -> cells.get(c.x()).set(c.y(),new Cell(true, c)));
    }

    private List<Cell> createRow(int columns, int rowIndex) {
        List<Cell> row = new ArrayList<>();
        for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
            row.add(new Cell(false, new Point(rowIndex, columnIndex )));
        }
        return row;
    }

    @Override
    public String toString() {
        return cells.stream()
                .map(getMapper())
                .collect(Collectors.joining("\n"));
    }

    private static Function<List<Cell>, String> getMapper() {
        return e -> e.stream()
                .map(Cell::toString)
                .collect(Collectors.joining());
    }
}
