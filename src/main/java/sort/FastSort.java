package sort;

import util.AlgorithmUtil;

/***
 * @description <快速排序>
 * @author 41746
 * @created 2023/12/14 17:54
 **/
public class FastSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 3, 4, 8, 9, 10};
        sort(arr, 0, arr.length - 1);
        AlgorithmUtil.printArray(arr);
    }

    public static void sort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }


        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            sort(arr, low, j);
        }
        if (high > i) {
            sort(arr, i, high);
        }

    }

}
