public class LifeObserver {
    public int[][] findAllNeighboursIn(Cell[][] universe) {
        int[][] allNeighbours = new int[universe.length][universe[0].length];

        for (int i = 0; i < universe[0].length; i++) {
            if (universe[0][i].lifeStatus()) {
                if(leftBoundaryCheck(i)) {
                    allNeighbours[0][i - 1] = 1;
                }
                if(rightBoundaryCheck(i, universe)) {
                    allNeighbours[0][i + 1] = 1;
                }
            }
        }

        return allNeighbours;
    }

    private boolean rightBoundaryCheck(int i, Cell[][] universe) {
        return !(i + 1 > universe.length);
    }

    private static boolean leftBoundaryCheck(int i) {
        return i > 0;
    }
}
