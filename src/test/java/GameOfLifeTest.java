import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class GameOfLifeTest {
    @Mock UniverseFactory universe_factory;
    @Mock Cell cell;
    @Mock LifeObserver observer;
    @Test void
    runs_its_universe() {
        boolean[][] board = {{true}};
        Cell[][] universe = {{cell}};
        int[][] all_neighbours = {{0}};

        given(universe_factory.createFrom(board)).willReturn(universe);
        given(observer.findAllNeighboursIn(universe)).willReturn(all_neighbours);
        GameOfLife gameOfLife = new GameOfLife(board, universe_factory, observer);

        gameOfLife.nextGen();

        verify(cell).updateNeighbours(all_neighbours[0][0]);
    }

}