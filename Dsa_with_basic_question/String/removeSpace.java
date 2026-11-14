class Main {
    public static void main(String[] args) {

        String str = "Java is easy";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);
    }
}