package ch.css.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Board {
    private final List<List<Cell>>cells = new ArrayList<>();

    public String init(int size) {
        for (int rowIndex=0; rowIndex<size; rowIndex++){
            cells.add(createRow(size));
        }
        return toString();
    }

    private List<Cell> createRow(int columns) {
        List<Cell>row = new ArrayList<>();
        for (int columnIndex = 0; columnIndex< columns; columnIndex++){
            row.add(new Cell());
        }
        return row;
    }

    @Override
    public String toString() {
       return cells.stream().flatMap(e-> e.stream().map(Cell::toString)).collect(Collectors.joining());
    }
}
