package sort;

import util.AlgorithmUtil;

/***
 * @description <冒泡排序>
 * @author 41746
 * @created 2023/12/14 17:54
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 3, 4, 8, 9, 10};
        sort(arr);
        AlgorithmUtil.printArray(arr);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
