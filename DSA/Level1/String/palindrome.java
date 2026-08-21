package DSA.Level1.String;

public class palindrome {
    public static void main(String[] args) {
        String str1 = "madam";
        String reverse = "";

        for(int i = str1.length()-1;i>=0;i--){
            reverse += str1.charAt(i);
        }
        
        System.out.println(reverse);

        if(str1.equals(reverse)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}

// output:it is palindrome