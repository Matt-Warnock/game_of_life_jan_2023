public class LifeObserver {
    private int[][] allNeighbours;

    public int[][] findAllNeighboursIn(Universe universe) {
        int yAxis = universe.xAxis();
        int xAxis = universe.yAxis();
        allNeighbours = new int[yAxis][xAxis];

        for (int yCoordinate = 0; yCoordinate < yAxis; yCoordinate++) {
            for (int xCoordinate = 0; xCoordinate < xAxis; xCoordinate++) {

                if (universe.getCell(yCoordinate, xCoordinate).isAlive()) {
                    if(leftBoundaryCheck(xCoordinate)) {
                        allNeighbours[yCoordinate][xCoordinate - 1] += 1;
                    }
                    if(rightBoundaryCheck(xCoordinate, universe)) {
                        allNeighbours[yCoordinate][xCoordinate + 1] = 1;
                    }
                    if(topBoundaryCheck(yCoordinate)) {
                        allNeighbours[yCoordinate - 1][xCoordinate] = 1;
                    }

                }
            }
        }

        return allNeighbours;
    }

    private boolean topBoundaryCheck(int i) {
        return i > 0;
    }

    private boolean rightBoundaryCheck(int j, Universe universe) {
        return !(j + 1 >= universe.xAxis());
    }

    private boolean leftBoundaryCheck(int j) {
        return j > 0;
    }
}
