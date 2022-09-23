package ch.css.kata;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class GameOfLifeTest {
    private final char ALIVE_CHARACTER = 'x'; // TODO character aus testee lesen

    @InjectMocks
    GameOfLife testee;

    @ParameterizedTest
    @CsvSource({"3,3", "4,4"})
    void shouldRenderInit(int boardSize, int aliveSize) {

        String renderedBoard = testee.init(boardSize, aliveSize);

        assertEquals(boardSize * boardSize, renderedBoard.length());

        long aliveCount = renderedBoard.chars()
                .filter(e -> e == ALIVE_CHARACTER)
                .count();
        assertEquals(aliveSize, aliveCount);
    }

}
