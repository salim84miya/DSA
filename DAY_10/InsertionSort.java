package DAY_10;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 4, 1, 5 };
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j > i + 1; j--) {
        if (arr[j - 1] > arr[j]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
