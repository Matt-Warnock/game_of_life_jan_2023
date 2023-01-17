import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Array;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class GameOfLifeTest {
    @Mock UniverseFactory universe_factory;
    @Mock Universe universe;
    @Test void
    runs_its_universe() {
        boolean[][] board = {{true}};

        given(universe_factory.createFrom(board)).willReturn(universe);
        GameOfLife gameOfLife = new GameOfLife(board, universe_factory);

        gameOfLife.nextGen();

        verify(universe).run();
    }

}