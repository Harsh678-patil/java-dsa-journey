package Day02;

public class Conditions {
    public static void main(String[] args) {
        int number = 50;
        if(number>0) {
            System.out.println("The number is positive.");
        } else if(number<0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        //number is even or odd
        if(number%2==0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        // greatest number among three numbers
        int num1 = 10, num2 = 20, num3 = 30;
        if(num1>num2 && num1>num3) {    
            System.out.println(num1 + " is the greatest number.");
        } else if(num2>num1 && num2>num3) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }
    }
}
