package sort;

import util.AlgorithmUtil;

/***
 * @description <插入排序>
 * @author 41746
 * @created 2023/12/14 17:54
 **/
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 3, 4, 8, 9, 10};
        sort(arr);
        AlgorithmUtil.printArray(arr);
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i - 1;
            while (k >= 0 && arr[k] > temp) {
                k--;
            }
            for(int j = i; j > k + 1; j--){
                arr[j] = arr[j - 1];
            }
            arr[k + 1] = temp;
        }
    }

}
