package Day4;

public class ReverseString {
    public static void main(String[] args) {
        // Reverse a String
        StringBuilder sb = new StringBuilder("Harsh");
        sb.reverse();
        System.out.println("Reversed string: " + sb);
        sb.append("Loves Coding");
        System.out.println("String after appending: " + sb);
        sb.insert(5, " the ");
        System.out.println("String after inserting: " + sb);
        sb.delete(5, 10);
        System.out.println("String after deleting: " + sb);
    }
}
