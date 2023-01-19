import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class LifeObserverTest {
    @Mock Cell livingCell;
    @Mock Cell deadCell;
    @Test void
    observes_living_neighbour_left_of_cell() {
        given(livingCell.lifeStatus()).willReturn(true);
        given(deadCell.lifeStatus()).willReturn(false);

        Cell[][] universe = {{deadCell, livingCell}};
        int[][] expected = {{1, 0}};

        LifeObserver lifeObserver = new LifeObserver();

        int[][] result = lifeObserver.findAllNeighboursIn(universe);

        assertArrayEquals(result, expected);
    }

}