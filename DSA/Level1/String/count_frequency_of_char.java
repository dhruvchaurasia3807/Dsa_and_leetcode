package DSA.Level1.String;

public class count_frequency_of_char {
    public static void main(String[] args) {
        String s1 = "banana";
        char target = 'a';
        int count = 0;

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);

            if (ch == target){
                count ++;
            }
        }
        System.out.println("Frequency =  "+ count);
    }
}


// output:Frequency =  3