package ch.css.kata;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class GameOfLifeTest {
    private final char ALIVE_CHARACTER = 'x';

    @InjectMocks
    GameOfLife testee;

    List<Point> initialAlive = Arrays.asList(new Point(1, 0), new Point(1, 1), new Point(1, 2));

    @ParameterizedTest
    @CsvSource({"3,oooxxxooo",
            "4,ooooxxxooooooooo"})
    void shouldRenderInit(int boardSize, String expectedBoard) {

        String renderedBoard = testee.init(boardSize, initialAlive);
        System.out.println(testee.toString());

        assertEquals(boardSize * boardSize, renderedBoard.replaceAll("\n", "")
                .length());
        assertEquals(expectedBoard, renderedBoard.replaceAll("\n", ""));
    }


}
