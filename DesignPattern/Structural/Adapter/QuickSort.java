package Structural.Adapter;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Arrays;

public class QuickSort {

    public int[] quickSort(int[] array) {
        sort(array, 0, array.length-1);
        return array;
    }

    private void sort(int[] array, int left, int right) {
        int partition = 0;
        if(left<right) {
            partition = getPartition(array, left, right);
            sort(array, left, partition-1);
            sort(array, partition+1, right);
        }
    }

    public int getPartition(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        int partVal = arr[mid];

        while (left <= right) {
            while (arr[left] < partVal)
                left++;

            while (arr[right] > partVal)
                right--;

            if (left <= right)
                swap(arr, left++, right--);

        }

        return left - 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] array = {5,2,3,1,6,7};
        System.out.println(Arrays.toString(qs.quickSort(array)));
    }
}