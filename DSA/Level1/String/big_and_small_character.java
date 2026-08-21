package DSA.Level1.String;

public class big_and_small_character {
    public static void main(String[] args) {
        String str = "tsunami";
        char small = str.charAt(0);
        char big  = str.charAt(0);


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch > big){
                big = ch;
            }
            if(ch < small){
                small = ch;
            }
        }
        
        System.out.println("the smallest char is " + small);
        System.out.println("the bigest char is " + big);


    }
}

// output:
// the smallest char is a
// the bigest char is u