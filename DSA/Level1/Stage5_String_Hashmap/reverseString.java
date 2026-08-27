package DSA.Level1.Stage5_String_Hashmap;

public class reverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        System.out.print(reverse + " ");
    }
}
