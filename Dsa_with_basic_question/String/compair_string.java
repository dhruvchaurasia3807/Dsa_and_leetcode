package Dsa_with_basic_question.String;

public class compair_string {
    public static void main(String[] args) {
        String str1 = "tony";
        String str2 = "tony";
        String str3 = new String("tony");

        if(str1 == str3){
            System.out.println("String is equal");
        }
        else{
            System.out.println("String is not equal");
        }
    }
}

// output:
// String is not equal(str1 == str3)
// String is equal(str1 == str2)