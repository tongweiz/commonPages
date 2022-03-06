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

    private int getPartition(int[] array, int left, int right) {
        int pivot = array[right];
        int fIndex = left - 1;
        for(int i=left; i<=right-1; i++) {
            if(array[i]<=pivot) {
                fIndex++;
                swap(array, fIndex, i);
            }
        }
        swap(array,fIndex+1,right);
        return fIndex+1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}