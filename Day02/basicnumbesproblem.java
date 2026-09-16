package Day02;

public class basicnumbesproblem {
    public static void main(String[] args) {
        int numbers[] = {5, 90, 78, 92, 88};
        int max=numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);

        //minimum number
        int min=numbers[0];
        for(int i=1; i<numbers.length; i++){    
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);

        //largest number
        int largest=numbers[0];
        for(int i=1;i<numbers.length; i++){
            if(numbers[i]>largest){
                largest=numbers[i];
                System.out.println("Largest number: " + largest);
            }
        }
        //for loop
        for(int i=0; i<=50; i+=5){
            System.out.println(i);
        }

        //factorial of a number
        int num = 5;
        int factorial = 1;  
        for(int i=1; i<=num; i++){
            factorial *= i;  
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
