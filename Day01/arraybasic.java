 public  class arraybasic {
    public static void main(String[] args) {
 int[] numbers = {10, 20, 30, 40, 50};

//for (int i = 0; i < numbers.length; i++) {
  //  System.out.println(numbers[i]);
  //maximumm number
  int max = numbers[0];
  for (int i=1; i<numbers.length; i++){
    if(numbers[i]>max){
        max= numbers[i];

    }
  }
  System.out.println("Maximum number is: " + max);
   //find even numbers
 
    for (int i=0; i<numbers.length; i++){
        if (numbers[i]%2==0){
            System.out.println(numbers[i]);
        }
    } System.out.println("Even numbers are: ");

//find odd numbers
  
    for (int i=0; i<numbers.length; i++){
        if (numbers[i]%2!=0){
            System.out.println(numbers[i]);
        }
    }
    System.out.println("Odd numbers are: ");
  //minimum number
  int min = numbers[0];
  for (int i=1; i<numbers.length; i++){
    if (numbers[i]<min){
        min= numbers[i];

    }
  }
  System.out.println("Minimum number is: " + min);

  //sum of all numbers
  int sum = numbers[0];
  for (int i=1; i<numbers.length; i++){
    sum += numbers[i];
  }
  System.out.println("Sum of all numbers is: " + sum);

 

}}
