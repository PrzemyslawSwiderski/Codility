public class Encryption {


    public static String encryption(String s) {
        // Write your code here
        var strBuilder = new StringBuilder();
        var sqrt = Math.sqrt(s.length());
        var columns = (int) Math.ceil(sqrt);

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                var idx = j * columns + i;
                if (idx < s.length()) {
                    var character = s.charAt(idx);
                    strBuilder.append(character);
                }
            }
            strBuilder.append(" ");
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {

//        var test = "chillout";
        var test = "feedthedog";
//        var test = "haveaniceday";
        String result = encryption(test);

        System.out.println("Result: " + result);

    }
}
