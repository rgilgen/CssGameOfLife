package ch.css.kata;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class GameOfLifeTest {
    /**
     * oooo
     * oxoo
     * oooo
     * oooo
     */
    @InjectMocks
    GameOfLife testee;

    @ParameterizedTest
    @CsvSource({"3","4"})
    void shouldRenderInit(int boardSize) {

        String renderedBoard = testee.init(boardSize);

        assertEquals(boardSize * boardSize, renderedBoard.length());
    }

}
