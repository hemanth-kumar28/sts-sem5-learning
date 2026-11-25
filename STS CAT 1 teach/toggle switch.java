// n is the number of switches
// q is operations need to be perfomred 


static int[] toggle(int n, int[] operations) {
    int[] switches = new int[n + 1];

    for (int x : operations) {
        for (int i = x; i <= n; i += x) {
            switches[i] ^= 1;
        }
    }

    return switches;
}