package DSA.Level1.Stage5_String_Hashmap;

public class longestWord {
     public static void main(String[] args) {

        String str = "I love programming";

        String[] words = str.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word = " + longest);
    }
}

// output:
// programming
