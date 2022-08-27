import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private final int size;
    private boolean isPercolates = false;
    private final WeightedQuickUnionUF weightedQuickUnionUF;
    private final boolean[] openSites;
    private int openSiteCount;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input size needs to be greater than zero");
        }

        size = n;
        openSites = new boolean[size * size + 2];

        weightedQuickUnionUF = new WeightedQuickUnionUF(size * size + 2);
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        validateRowOrColumn(row);
        validateRowOrColumn(col);

        int currentIndex = convertTo1DIndex(row, col);
        if (openSites[currentIndex]) {
            return;
        }

        if (row == 1) {
            weightedQuickUnionUF.union(0, currentIndex);
        }

        openSites[currentIndex] = true;
        openSiteCount++;

        if (col > 1 && openSites[getLeftSite(row, col)]) {
            int leftSide = getLeftSite(row, col);
            // System.out.println("Unioning " + currentIndex + " and " + leftSide);
            weightedQuickUnionUF.union(currentIndex, leftSide);
        }

        if (col < size && openSites[getRightSite(row, col)]) {
            int rightSide = getRightSite(row, col);
            // System.out.println("Unioning " + currentIndex + " and " + rightSide);
            weightedQuickUnionUF.union(currentIndex, rightSide);
        }

        if (row > 1 && openSites[getTopSite(row, col)]) {
            int topSite = getTopSite(row, col);
            // System.out.println("Unioning " + currentIndex + " and " + topSite);
            weightedQuickUnionUF.union(currentIndex, topSite);
        }

        if (row < size && openSites[getBottomSite(row, col)]) {
            int bottomSite = getBottomSite(row, col);
            // System.out.println("Unioning " + currentIndex + " and " + bottomSite);
            weightedQuickUnionUF.union(currentIndex, bottomSite);
        }
    }

    private void validateRowOrColumn(int row) {
        if (row <= 0 || row > size) {
            throw new IllegalArgumentException("Row needs to be between 0 and " + size);
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        validateRowOrColumn(row);
        validateRowOrColumn(col);

        return openSites[convertTo1DIndex(row, col)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        validateRowOrColumn(row);
        validateRowOrColumn(col);

        int index = convertTo1DIndex(row, col);

        return openSites[index]
                && weightedQuickUnionUF.find(0) == weightedQuickUnionUF.find(index);
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return openSiteCount;
    }

    // does the system percolate?
    public boolean percolates() {
        return weightedQuickUnionUF.find(0)
                == weightedQuickUnionUF.find(size * size + 1);
    }

    // test client (optional)
    public static void main(String[] args) {
        Percolation percolation = new Percolation(3);
        System.out.println("0. Percolates? " + percolation.percolates());
        percolation.open(1, 2);
        System.out.println("1. Percolates? " + percolation.percolates());
        percolation.open(3, 3);
        System.out.println("2. Percolates? " + percolation.percolates());
        percolation.open(3, 2);
        System.out.println("3. Percolates? " + percolation.percolates());
        percolation.open(2, 3);
        System.out.println("4. Percolates? " + percolation.percolates());
        percolation.open(1, 3);
        System.out.println("5. Percolates? " + percolation.percolates());
    }

    private int convertTo1DIndex(int row, int col) {
        return size * (row - 1) + col;
    }

    private int getLeftSite(int row, int col) {
        if (col == 1) {
            throw new IllegalArgumentException("Cannot get left of 0th column");
        }

        return convertTo1DIndex(row, col - 1);
    }

    private int getRightSite(int row, int col) {
        if (col == size) {
            throw new IllegalArgumentException("Cannot get right of nth column");
        }

        return convertTo1DIndex(row, col + 1);
    }

    private int getTopSite(int row, int col) {
        if (row == 1) {
            throw new IllegalArgumentException("Cannot get left of 0th column");
        }

        return convertTo1DIndex(row - 1, col);
    }

    private int getBottomSite(int row, int col) {
        if (row == size) {
            throw new IllegalArgumentException("Cannot get right of nth column");
        }

        return convertTo1DIndex(row + 1, col);
    }
}
