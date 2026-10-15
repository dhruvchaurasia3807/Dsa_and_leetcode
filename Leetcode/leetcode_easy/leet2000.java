public class leet2000 {
    public static String reversePrefix(String word, char ch){
        int i = 0;
        int j = word.indexOf(ch);

        char[] chars = word.toCharArray();
        while(i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String result = reversePrefix(word, ch);
        System.out.println(result);
    }
}


// output:dcbaefd