package Day4;
public class StringBasics {
    public static void main(String[] args) {
    //count Characters in a string
    String name = "harsh the warrior";
    int count = name.length();
    System.out.println("Total characters in the string: " + count);  
        //print each charactear in string
        String king = "sidhhi";
        for(int i=0; i<king.length(); i++){
            System.out.println(king.charAt(i));
        }
    

}
}
