import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class GameOfLifeTest {
    @Mock Universe universe;
    @Mock Cell cell;
    @Mock LifeObserver observer;
    @Test void
    runs_its_universe() {
        boolean[][] board = {{true}};
        int yCoordinate = 0;
        int xCoordinate = 0;
        int[][] all_neighbours = {{0}};

        given(universe.createFrom(board)).willReturn(universe);
        given(universe.yAxis()).willReturn(1);
        given(universe.xAxis()).willReturn(1);
        given(universe.getCell(yCoordinate, xCoordinate)).willReturn(cell);
        given(observer.findAllNeighboursIn(universe)).willReturn(all_neighbours);

        GameOfLife gameOfLife = new GameOfLife(board, universe, observer);

        gameOfLife.nextGen();

        verify(cell).updateNeighbours(all_neighbours[0][0]);
    }

}