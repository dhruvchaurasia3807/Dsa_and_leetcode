package DSA.Level1.String;
public class printString_elements {
    public static void main(String[] args) {

        String str = "hello";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

            if (i < str.length() - 1) {
                System.out.print(",");
            }
        }
    }
}