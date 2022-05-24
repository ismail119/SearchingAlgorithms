package Sortings;

public class InsertionSorting {

    //Best case, worst case , average case =n^2

    public static void main(String[] args) {

        int [] numbers = {1,4,5,3,6,9,7,15,0,13,-1};
        int temp;

        for (int i =2;i<numbers.length;i++){

            for (int j = i;j>0;j--){
                if(numbers[j]>numbers[j-1]){
                    break;
                }
                else{
                    temp = numbers[j];
                    numbers[j]=numbers[j-1];
                    numbers[j-1]=temp;
                }
            }
        }
    }
}
