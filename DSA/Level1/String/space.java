package DSA.Level1.String;

public class space {
    public static void main(String[] args) {
        String str = "hello world java";
        int count = 0;

        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
            
           if(ch == ' '){
            count++;
           }
        }
        System.out.println("the no of space = " + count);
    }
}

// output:the no of space = 2
