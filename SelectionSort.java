public class SelectionSort implements SortingAlgorithm {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(i, findMin(i, arr), arr);
        }
    }

    public int findMin(int pos, int[] array) {
        int min = pos;
        for (int j = pos + 1; j < array.length; j++) {
            if (array[j] < array[min]) {
                // For Comparable Interface: if (array[j].compareTo(array[min]) < 0)
                min = j;
            }
        }
        return min;
    }

    public void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
