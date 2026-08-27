package DSA.Level1.Stage5_String_Hashmap;
import java.util.HashMap;
public class char_freq {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch,0) +1);
        }

        System.out.println(map);

    }
}


// output:{p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}