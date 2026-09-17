package Day3;

public class ArrayProblems {
    public static void main (String[] args) {
      int numbers[] = {1, 2, 3, 4, 5}; 
      System.out.println(findMax(numbers));
      System.out.println(findMin(numbers));
      System.out.println(findsum(numbers));
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int MIN = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]<MIN){
                MIN=arr[i];
            }
        }
        return MIN;
    }
    public static int findsum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
