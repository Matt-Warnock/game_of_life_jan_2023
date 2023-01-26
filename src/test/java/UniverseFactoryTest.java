import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniverseTest {

    @Test
    void creates_a_universe_from_board_populated_with_cells() {
        boolean[][] board = {{true, false}};

        Universe universeFactory = new Universe();
        Universe universe = universeFactory.createFrom(board);

        Cell livingCell = universe.getCell(0, 0);
        Cell deadCell = universe.getCell(0, 1);

        assertEquals(universe.yAxis(), board.length);
        assertEquals(universe.xAxis(), board[0].length);
        assertTrue(livingCell.isAlive());
        assertFalse(deadCell.isAlive());
    }
}