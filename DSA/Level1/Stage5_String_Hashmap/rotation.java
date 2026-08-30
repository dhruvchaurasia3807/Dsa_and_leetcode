package DSA.Level1.Stage5_String_Hashmap;

public class rotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if(s1.length() != s2.length()){
            System.out.println("not rotation");
        }
        else if((s1+s2).contains(s2)){
            System.out.println("rotation");
        }
        else{
            System.out.println("not rotation");
        }
    }
}
