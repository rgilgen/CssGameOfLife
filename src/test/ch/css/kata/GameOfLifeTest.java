package ch.css.kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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

    @Test
    void shouldRenderInit() {
        int boardSize = 3;

        String renderedBoard = testee.init(boardSize);

        assertEquals(boardSize * boardSize, renderedBoard.length());

    }

}
