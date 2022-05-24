package Searching;

public class BinarySearch {
    //Best case =1 , average = log2n worst = log2n dir.

    static int[] array = {0,5,8,9,13,22,23,54};

    public static void main(String[] args) {
       int Index = BinarySearching(array,0,array.length-1,13);
       System.out.println(Index);
    }

    private static int BinarySearching(int[] array,int leftIndex,int rightIndex,int searchingNumber) {

        if (searchingNumber==array[leftIndex])return leftIndex;
        if (searchingNumber==array[rightIndex])return rightIndex;

        int midIndex = (leftIndex+rightIndex)/2;

        if(array[midIndex]<searchingNumber)
            return BinarySearching(array,midIndex,rightIndex,searchingNumber);
        else if(array[midIndex]>searchingNumber)
            return BinarySearching(array,leftIndex,midIndex,searchingNumber);
        else
            return midIndex;
    }
}
