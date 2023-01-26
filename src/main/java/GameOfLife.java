public class GameOfLife {
    private LifeObserver observer;
    private Universe universe;

    public GameOfLife(boolean[][] board, Universe universe, LifeObserver observer) {
        this.observer = observer;
        this.universe = universe.createFrom(board);
    }

    public void nextGen() {
        int[][] all_neighbours = this.observer.findAllNeighboursIn(this.universe);
        updateCellsWith(all_neighbours);
    }

    private void updateCellsWith(int[][] all_neighbours) {
        for (int i = 0; i < universe.yAxis(); i++) {
            for (int j = 0; j < universe.xAxis(); j++) {
                Cell cell = this.universe.getCell(i, j);
                int neighbours = all_neighbours[i][j];
                cell.updateNeighbours(neighbours);
            }
        }
    }
}
