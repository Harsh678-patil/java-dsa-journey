package Day3;

public class Methods {
    public static void main(String[]args){
    printname();
    printsqure();
    System.out.println(isEven(10)); 
    System.out.println(max(5, 10, 3));
    System.out.println(factorial(5));   

    }
    
    public static void printname(){
        System.out.println("Harsh");
    }   
    public static void printsqure(){
        int num=9;
        int square =num*num;
        System.out.println("Square of number is: " + square);
    }
    public static boolean isEven(int number){

        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
}
