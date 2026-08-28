package DSA.Level1.Stage5_String_Hashmap;

import java.util.HashMap;

public class first_non_repeat_element {
    public static void main(String[] args) {
        String str = "swiss";

        HashMap<Character,Integer> m = new HashMap<>();

        for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        m.put(ch, m.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(m.get(ch) ==1){
                System.out.println("first non repeating =  "+ ch);
                break;
            }
        }
    }
}


// output:first non repeating =  w