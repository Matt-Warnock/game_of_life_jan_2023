public class Universe {
    private Cell[][] universeBoard;
    public Universe createFrom(boolean[][] board) {
        universeBoard = new Cell[board.length][board[0].length];
        convertLifeInstructionsFrom(board);

        return this;
    }

    public int yAxis() {
        return universeBoard.length;
    }

    public int xAxis() {
        return universeBoard[0].length;
    }

    public Cell getCell(int yCoordinate, int xCoordinate) {
        return universeBoard[yCoordinate][xCoordinate];
    }
    private void convertLifeInstructionsFrom(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.universeBoard[i][j] = new Cell(board[i][j]);
            }
        }
    }
}
