/**
 * Created by qmtruong92 on 3/23/17.
 */
public class DeleteLater {


    public static void main(String[] args) {


        int a = 5;
        int b = a /4 ;
        int c = b * a - a -b; //-1


        a = confuseUS(a, b, c); //9
        System.out.println(a + " " + b + " " + c);

        a = 3 +c; //2


        b = (a-b*a) / 6 + 1; //1

        c = confuseUS(b,c,a); // 0


        System.out.println(c + " " + a + " " + b);

    }

    public static int confuseUS(int a, int b, int c) {

        a = b * c + a;
        System.out.println("confuseUs a = " + a);
        c = a + b * 3;
        System.out.println("confuseUs c = " + c);

        return (c-a) * (a-b);
    }
}
