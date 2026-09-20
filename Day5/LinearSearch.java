package Day5;

public class LinearSearch {
    static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    public static void main (String[] args){
        int arr[] = {12, 34, 54, 2, 3};
        int result = search(arr,54);
        System.out.println("Element found at index: " + result);
    }
}
