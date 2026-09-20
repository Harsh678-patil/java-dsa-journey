package Day5;

public class Bubblesort {
    public static void main(String[] args){
        int arr[] = {12, 34, 54, 2, 3};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // Print the sorted array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");


        }
        //occurrence of 5
        int arr1[]={2,5,7,5,9,5};
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] ==5){
                System.out.println("Element found at index: " + i);
            }

            //bubble sort
            int arr2[] = {12, 34, 54, 2, 3};
            for(int i1=0; i1<arr2.length-1; i1++){
                for(int j=0; j<arr2.length-i1-1; j++){
                    if(arr2[j]>arr2[j+1]){
                        int temp=arr2[j];
                        arr2[j]=arr2[j+1];
                        arr2[j+1]=temp;
                    }
                }
            }
            System.out.println("Sorted array:");
            for(int i=0; i<arr2.length; i++){
                System.out.print(arr2[i] + " ");
            }
        }

    }
}
