import java.util.Objects;

public class Cell {
    private boolean life_state;

    public Cell(boolean life_state) {
        this.life_state = life_state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell cell)) return false;
        return life_state == cell.life_state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(life_state);
    }

    public void updateNeighbours(int neighbours) {
        throw new UnsupportedOperationException();
    }

    public boolean lifeStatus() {
        throw new UnsupportedOperationException();
    }
}
