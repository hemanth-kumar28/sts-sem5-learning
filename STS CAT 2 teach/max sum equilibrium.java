static int maxEquilibriumSum(int[] nums) {
    int prefix = 0, suffix = 0;
    int best = Integer.MIN_VALUE;

    for (int value : nums)
        suffix += value;

    for (int value : nums) {
        prefix += value;
        if (prefix == suffix)
            best = Math.max(best, prefix);
        suffix -= value;
    }

    return best;
}