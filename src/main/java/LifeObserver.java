public class LifeObserver {
    public int[][] findAllNeighboursIn(Cell[][] universe) {
        int[][] allNeighbours = new int[universe.length][universe[0].length];

        for (int i = 0; i < universe[0].length; i++) {
            if (universe[0][i].lifeStatus()) {
                allNeighbours[0][i - 1] = 1;
            }
        }

        return allNeighbours;
    }
}
