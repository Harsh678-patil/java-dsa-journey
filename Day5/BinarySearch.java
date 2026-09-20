package Day5;

public class BinarySearch {
    static int search(int arr[], int target){
     
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target)
                return mid;

            if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;  
    }
    public static void main (String[] args){
        int arr[] = {2, 3, 12, 34, 54};
        int result = search(arr,54);
        System.out.println("Element found at index: " + result);
    }
}
