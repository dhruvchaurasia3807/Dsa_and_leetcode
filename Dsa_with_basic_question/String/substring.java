package Dsa_with_basic_question.String;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class substring {
    public static String substring(String str, int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        String result = substring(str, 0, 5);
        System.out.println(result);
        //inbuilt function
        System.out.println(str.substring(0,5));
    }
}

// output:
// Hello
// Hello