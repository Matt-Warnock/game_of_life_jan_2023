public class GameOfLife {
    private boolean[][] universeBoard;
    private Universe universe;

    public GameOfLife(boolean[][] universeBoard, UniverseFactory universe_factory) {
        this.universeBoard = universeBoard;
        this.universe = universe_factory.createFrom(universeBoard);
    }

    public void nextGen() {
        this.universe.run();
    }
}
