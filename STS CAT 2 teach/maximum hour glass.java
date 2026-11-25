static long maxHourglassSum(int[][] a) {
    if (a.length < 3 || a[0].length < 3) {
        throw new IllegalArgumentException("Need at least 3 rows and columns");
    }

    long best = Long.MIN_VALUE;

    for (int row = 0; row < a.length - 2; row++) {
        for (int col = 0; col < a[0].length - 2; col++) {
            long sum = (long) a[row][col] + a[row][col + 1] + a[row][col + 2]
                    + a[row + 1][col + 1]
                    + a[row + 2][col] + a[row + 2][col + 1] + a[row + 2][col + 2];
            best = Math.max(best, sum);
        }
    }
    return best;
}