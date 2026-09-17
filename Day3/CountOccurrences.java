package Day3;
public class CountOccurrences  {

    public static int countOccurrences(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 8, 2, 10, 5};

        int result = countOccurrences(arr, 2);

        System.out.println("2 occurs " + result + " times");
    }
}