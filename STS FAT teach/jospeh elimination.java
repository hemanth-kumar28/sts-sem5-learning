static int josephus(int nums, int step) {
    long survivor = 0;

    for (long size = 2; size <= nums; size++)
        survivor = (survivor + step) % size;

    return (int) survivor + 1;
}