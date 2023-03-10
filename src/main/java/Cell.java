import java.util.Objects;

public class Cell {
    private boolean isAlive;

    public Cell(boolean life_state) {
        this.isAlive = life_state;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void updateNeighbours(int neighbours) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell cell)) return false;
        return isAlive == cell.isAlive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAlive);
    }
}
