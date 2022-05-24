package Sortings;

public class QuickSorting {
    //For Big Data , this is one of the predominate sorting algorithms .Big-Oh = n.log(n)

    static int[] myArray = {1,8,3,9,4,5,7,21,54,22,19,0};

    static void PrintMyArray(int[] array){
        for (int i:array) System.out.println(i);
    }

    private static void QuickSort(int[] array,int lowIndex,int lastIndex) {
        if (lowIndex>=lastIndex)return;

        int pivot = array[lastIndex];
        int left = lowIndex;
        int right = lastIndex;

        while (left<right){

            while(array[left]<=pivot && left<right)
                left++;

            while(array[right]>=pivot && left<right)
                right--;

            Swap(array,left,right);
        }
        Swap(array,left,lastIndex);//Pivot and L,R
        QuickSort(array,lowIndex,left-1);
        QuickSort(array,left+1, lastIndex);

    }

    static void Swap(int[] array,int firstIndex,int lastIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = temp;
    }

    public static void main(String[] args) {
        PrintMyArray(myArray);
        QuickSort(myArray,0,myArray.length-1);
        System.out.println("---------------");
        PrintMyArray(myArray);
    }

}
