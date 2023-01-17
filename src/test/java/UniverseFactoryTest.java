import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniverseFactoryTest {

    @Test
    void creates_a_universe_from_board_populated_with_cells() {
        boolean[][] board = {{true, false}};
        Cell[][] expected_universe = {{new Cell(true), new Cell(false)}};

        UniverseFactory universeFactory = new UniverseFactory();
        Cell[][] universe = universeFactory.createFrom(board);

        assertArrayEquals(universe, expected_universe);
    }
}