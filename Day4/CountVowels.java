package Day4;

public class CountVowels {
    String str = "harsh the warrior";
    int count = 0;

    public static void main(String[] args) {
        CountVowels cv = new CountVowels();
        cv.countVowels();
    }

    public void countVowels() {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                System.out.println("Vowel found: " + ch);
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
