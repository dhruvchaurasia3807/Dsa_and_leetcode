package java_collection_freamwork.HashMap;
import java.util.HashMap;
public class check_twoString_anagram {
    public static void main(String[] args) {
       String s1 = "listen";
       String s2 = "silent";
       
       if(s1.length() != s2.length()){
        System.out.println("not anagram");
        return;
       }

       HashMap<Character,Integer> map = new HashMap<>();

       //count characters of first string
       for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);
       }

       //remove characters using second string
       for(int i=0;i<s2.length();i++){
        char ch = s2.charAt(i);

        if(!map.containsKey(ch)){
            System.out.println("not Anagram");
            return;
        }

        map.put(ch, map.get(ch)-1);

        if(map.get(ch) == 0){
            map.remove(ch);
        }
       }

       if(map.isEmpty()){
        System.out.println("Anagram");
       }else{
        System.out.println("Not Anagram");
       }
    }
}


// output:Anagram