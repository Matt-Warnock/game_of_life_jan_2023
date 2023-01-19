public class GameOfLife {
    private boolean[][] universeBoard;
    private LifeObserver observer;
    private Cell[][] universe;

    public GameOfLife(boolean[][] universeBoard, UniverseFactory universe_factory, LifeObserver observer) {
        this.universeBoard = universeBoard;
        this.observer = observer;
        this.universe = universe_factory.createFrom(universeBoard);
    }

    public void nextGen() {
        int[][] all_neighbours = this.observer.findAllNeighboursIn(this.universe);
        updateCellsWith(all_neighbours);
    }

    private void updateCellsWith(int[][] all_neighbours) {
        for (int i = 0; i < universe.length; i++) {
            for (int j = 0; j < universe[0].length; j++) {
                Cell cell = this.universe[i][j];
                int neighbours = all_neighbours[i][j];
                cell.updateNeighbours(neighbours);
            }
        }
    }
}
