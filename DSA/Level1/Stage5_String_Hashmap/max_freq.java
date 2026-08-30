package DSA.Level1.Stage5_String_Hashmap;
import java.util.HashMap;
public class max_freq {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        char maxChar = str.charAt(0);
        int maxFreq = 0;
        for(char ch:map.keySet()){
            if(map.get(ch) > maxFreq){
                maxFreq = map.get(ch);
                maxChar = ch;
            }
        }

        System.out.println("Character = "+ maxChar);
        System.out.println("Frequency = "+ maxFreq);
    }
}


// output:
// Character = r
// Frequency = 2