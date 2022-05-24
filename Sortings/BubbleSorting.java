package Sortings;

public class BubbleSorting {

    // Worst case=n^2, best case = 1, average = n

    public static void main(String[] args) {

        int[] numbers = {5, 2, 7 ,4 ,15, 14, 21,0};
        int temp;
        boolean isChange=true;
        while (isChange){
            isChange = false;
            for (int i = 0;i<numbers.length-1;i++){
                if(numbers[i]>numbers[i+1]){
                    temp = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i]=temp;
                    isChange=true;
                }
            }
        }

        for (int i:numbers) System.out.println(i);
    }
}
