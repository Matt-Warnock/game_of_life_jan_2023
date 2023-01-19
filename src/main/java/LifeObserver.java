public class LifeObserver {
    private int[][] allNeighbours;

    public int[][] findAllNeighboursIn(Cell[][] universe) {
        int yAxis = universe.length;
        int xAxis = universe[0].length;
        allNeighbours = new int[yAxis][xAxis];

        for (int yCoordinate = 0; yCoordinate < yAxis; yCoordinate++) {
            for (int xCoordinate = 0; xCoordinate < xAxis; xCoordinate++) {

                if (universe[yCoordinate][xCoordinate].isAlive()) {
                    if(leftBoundaryCheck(xCoordinate)) {
                        allNeighbours[yCoordinate][xCoordinate - 1] += 1;
                    }
                    if(rightBoundaryCheck(xCoordinate, universe)) {
                        allNeighbours[yCoordinate][xCoordinate + 1] = 1;
                    }
                    if(topBoundaryCheck(yCoordinate, universe)) {
                        allNeighbours[yCoordinate - 1][xCoordinate] = 1;
                    }

                }
            }
        }

        return allNeighbours;
    }

    private boolean topBoundaryCheck(int i, Cell[][] universe) {
        return i > 0;
    }

    private boolean rightBoundaryCheck(int j, Cell[][] universe) {
        return !(j + 1 >= universe[0].length);
    }

    private boolean leftBoundaryCheck(int j) {
        return j > 0;
    }
}
