import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class LifeObserverTest {
    private LifeObserver lifeObserver;
    @Mock Cell livingCell;
    @Mock Cell deadCell;

    @BeforeEach void
    setup() {
        given(livingCell.isAlive()).willReturn(true);
        given(deadCell.isAlive()).willReturn(false);

        lifeObserver = new LifeObserver();
    }
    @Disabled
    @Test void
    observes_living_neighbour_left_of_cell() {
        Cell[][] universe = {{deadCell, livingCell}};
        int[][] expected = {{1, 0}};

        // int[][] result = lifeObserver.findAllNeighboursIn(universe);

        // assertArrayEquals(result, expected);
    }

    @Test void
    observes_living_neighbour_right_of_cell() {
        Cell[][] universe = {{livingCell, deadCell}};
        int[][] expected = {{0, 1}};

        // int[][] result = lifeObserver.findAllNeighboursIn(universe);

        // assertArrayEquals(result, expected);
    }
    @Test void
    observes_both_living_neighbour_right_and_left_of_cell() {
        Cell[][] universe = {{livingCell, deadCell, livingCell}};
        int[][] expected = {{0, 2, 0}};

        // int[][] result = lifeObserver.findAllNeighboursIn(universe);

        // assertArrayEquals(result, expected);
    }
    @Test void
    observes_living_neighbour_top_of_cell() {
        Cell[][] universe = {{deadCell}, {livingCell}};
        int[][] expected = {{1},{0}};

        // int[][] result = lifeObserver.findAllNeighboursIn(universe);

        // assertArrayEquals(result, expected);
    }
}