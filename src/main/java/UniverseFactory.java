public class UniverseFactory {
    public Cell[][] createFrom(boolean[][] board) {
        Cell[][] universe = new Cell[board.length][board[0].length];
        convertLifeInstructionsFrom(board, universe);

        return universe;
    }

    private static void convertLifeInstructionsFrom(boolean[][] board, Cell[][] universe) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                universe[i][j] = new Cell(board[i][j]);
            }
        }
    }
}
