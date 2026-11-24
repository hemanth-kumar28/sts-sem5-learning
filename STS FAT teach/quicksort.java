import java.util.*;

class Main{

static void quicksort(int[] a, int low, int high){
    if (low>=high) return;

    int pivotIndex = partition(a, low, high);
    quicksort(a, low, pivotIndex-1);
    quicksort(a, pivotIndex+1, high);
}

static int partition(int[] a, int low, int high){
    int pivot = a[high];
    int next = low;

    for(int i = low; i<high; i++){
        if(a[i]<pivot){
            swap(a, next, i);
            next++;
        }
    }
    swap(a, next, high);
    return next;
}

static void swap(int[] a, int i, int j) {
    int saved = a[i];
    a[i] = a[j];
    a[j] = saved;
}

public static void main(String[] args) {
        int[] a = {8, 3, 6, 2, 5};

        quicksort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }
}