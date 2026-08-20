package DSA.Level1.String;

public class Print_char {
    public static void main(String[] args) {
        String item = "abcde";
        for(int i=0;i<item.length();i++){
            System.out.println(item.charAt(i));
        }
        System.out.println(item.length());
    }
}
