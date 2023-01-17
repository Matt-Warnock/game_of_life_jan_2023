import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FeatureTestGameOfLife {
    @Test
    public void
    cell_dies_when_under_populated() {
        boolean[][] universe_board = {
                {false, false, false},
                {false, true, false},
                {false, false, false}
        };
        boolean[][] expected_universe = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };;

        GameOfLife gameOfLife = new GameOfLife(universe_board);

        gameOfLife.nextGen();

        assertThat(universe_board, is(expected_universe));
    }
}
