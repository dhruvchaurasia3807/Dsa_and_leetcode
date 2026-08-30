package DSA.Level1.Stage5_String_Hashmap;

public class countWord {
    public static void main(String[] args) {
        String str = "i love java programming";

        int count = 1;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count ++;
            }
        }
        System.out.println("words = "+ count);
    }
}


// output:words = 4