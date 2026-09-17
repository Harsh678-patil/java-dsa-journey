package Day02;

public class ArrayProblems {
    public static void main(String[] args) {
       int nums[] = {10, 25, 7, 40, 15};
       int max =nums[0];
       for(int i=1; i<nums.length; i++){
        if(nums[i]>max){
            max=nums[i];
        }
        
       }
       System.out.println("Maximum number: " + max);

       //reverse an array

        int[] numbers = {1, 2, 3, 4, 5};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            // Swap
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // Move indexes
            left++;
            right--;
        }

        // Print reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    //2nd largest number
    
    int num[] = {10, 25, 70,40, 80};
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > secondLargest && num[i] < max) {
                secondLargest = num[i];
            }
        }
        System.out.println("Second largest number: " + secondLargest);
    }
}
