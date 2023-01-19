import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeObserverTest {
    @Test void
    observes_neighbours_left_and_right_of_cells() {
        boolean[][] board = {{true, true}};
        int[][] expectedAllNeighbours = {{1,1}};
        Cell[][] universe = new UniverseFactory().createFrom(board);

        LifeObserver lifeObserver = new LifeObserver();

        int[][] allNeighbours = lifeObserver.findAllNeighboursIn(universe);

        assertArrayEquals(allNeighbours, expectedAllNeighbours);
    }

}