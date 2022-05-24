package Sortings;

public class SelectionSorting {

    //Best case, worst case , average case =n^2

    public static void main(String[] args) {

        int[] numbers = {8,1,4,5,3,9,0,6};
        int temp;
        int min;

        for (int i=0;i<numbers.length;i++){
            min = i;
            for (int j=i;j<numbers.length;j++){
                if(numbers[min]>numbers[j]){
                    temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
