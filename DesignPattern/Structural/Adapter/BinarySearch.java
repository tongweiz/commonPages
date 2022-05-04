package Structural.Adapter;

public class     BinarySearch {

    public int bSearch(int[] array, int key) {
        int minIndex = 0, maxIndex = array.length-1;
        while(minIndex<=maxIndex) {
            int midIndex = (minIndex+maxIndex)/2;
            if(array[midIndex]<key) {
                minIndex = midIndex + 1;
            } else if(array[midIndex]>key) {
                maxIndex = midIndex - 1;
            } else {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {1,2,3,4,5,6};
        System.out.println(bs.bSearch(array, 8));
    }
}
