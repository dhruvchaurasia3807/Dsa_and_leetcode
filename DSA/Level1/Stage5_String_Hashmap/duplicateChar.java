package DSA.Level1.Stage5_String_Hashmap;
import java.util.HashMap;
public class duplicateChar {
    public static void main(String[] args) {
        String str = "programming";
       
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            m.put(ch, m.getOrDefault(ch, 0)+1);
        }
        
        for(char ch:m.keySet()){
            if(m.get(ch)>1){
                System.out.println(ch);
            }
        }
    }
}


// output:
// r
// g
// m