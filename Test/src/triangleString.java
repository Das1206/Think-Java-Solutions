/**
 * Created by qmtruong92 on 3/23/17.
 */
public class triangleString {

    public static void main(String[] args) {

        System.out.println(triangleString("learntocode"));
    }

    public static String triangleString(String parameter) {
        String result = "";

        result += parameter.charAt(0);

        result += "\n";

        for (int i = 1; i < parameter.length(); i++) {

            for (int letters = 0; letters <= i; letters++) {

                result += parameter.charAt(i);

            }

            result += "\n";

        }
        return result;
    }
}
