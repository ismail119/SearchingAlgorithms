package Sortings;

import javax.imageio.ImageTranscoder;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSorting {
    //For Big Data , this is one of the predominate sorting algorithms .Big-Oh = n.log(n)

    static int[] array = {38,27,43,3,9,82,10};
    public static void main(String[] args) {
        PrintMyArray(array);
        MergeSort(array);
        PrintMyArray(array);

    }

    private static void MergeSort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength<2)return;

        int divideIndex = array.length/2;
        int[] leftHalf = Arrays.copyOfRange(array,0,divideIndex);
        int[] rightHalf = Arrays.copyOfRange(array,divideIndex,arrayLength);

        MergeSort(leftHalf);
        MergeSort(rightHalf);

        Merge(array,leftHalf,rightHalf);
    }

    private static void Merge(int[]myArray, int[] leftHalf,int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                myArray[k] = leftHalf[i];
                i++;
            }
            else {
                myArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            myArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            myArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }


    private static void PrintMyArray(int[] array) {
        for (int i:array) System.out.println(i);
    }
}
