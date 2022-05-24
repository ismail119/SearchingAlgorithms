package Searching;

import java.util.Arrays;

public class JumpSearching {

    // √n + n => n

    static int[] array =  {12,16,25,37,65,76,89,91,100,110,143,145,176,187,199,200};

    public static void main(String[] args) {

        int Index = JumpSearch(array,0, (int)Math.sqrt(array.length),200);
        System.out.println(Index);
    }

    private static int JumpSearch(int[] array,int leftPointer,int increment,int searchingNumber) {
        var pointerIndex = leftPointer;
        var nextPointer = leftPointer + increment;
        if(nextPointer>=array.length) return FindIndex(pointerIndex,Arrays.copyOfRange(array,pointerIndex,nextPointer),searchingNumber);

        if(array[nextPointer]<=searchingNumber) {
            pointerIndex = nextPointer;
            return JumpSearch(array,pointerIndex,increment,searchingNumber);
        }
        else
            return FindIndex(pointerIndex,Arrays.copyOfRange(array,pointerIndex,nextPointer),searchingNumber);
    }

    static int FindIndex(int leftIndex,int []array,int number ) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == number) return i + leftIndex;
        }
        return 0;
    }
}
