package first_try;

import java.util.Scanner;

public class Mathematics {

    public static void task_1() {
        int P, a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        P = a * 4;
        System.out.println("P = " + a + " * 4 = " + P);
    }

    public static int task_2() {
        int centimetres, metres;
        Scanner in = new Scanner(System.in);
        centimetres = in.nextInt();
        metres = centimetres / 100;
        System.out.println(centimetres + "  centimetres contain " + metres + " metres ");
        return metres;
    }

    public static boolean task_3(int a, int b, int c) {
        return ((a < c) && (b > c)) || ((a > c) && (b < c));
    }

    public static int task_4(int a, int b, int c) {
        int sum = 0;
        if (a < b && a < c)
            sum = b + c;
        else if (b > c)
            sum = a + b;
        else
            sum = a + c;
        return sum;
    }

    public static void task_5(double x, double y, double z) {
        double a, b;
        double sqr_z = z * z;
        b = 1 + sqr_z / (3 + sqr_z / 5);
        a = (2 * Math.sin(x - Math.PI / 6) * b) / (1.0 / 2 + Math.pow(Math.sin(y), 2.0));
        System.out.println("a = " + a + '\n' + "b = " + b);
    }

    public static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    public static  void task_6(double x, double y) {
        double S = 1;
        for (int i = 1; i <= 4; i++)
            S += Math.pow(x, i) / fact(i);
        double z = Math.sin(Math.pow(x, 3)) + Math.pow(Math.cos(y), 2);
        System.out.println("S = " + S + '\n' + "z = " + z);
    }

    public static String task_7(int index) {
        switch (index) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "error";
        }
    }

    public static int task_8(int N) {
        int res = 0;
        for (int i = 0; i <= N; i++)
            res += (N + i) * (N + i);
        return res;
    }

    public static boolean task_9(int n){
        double log3 = Math.log(n) / Math.log(3);
        if(log3 % 1 == 0)
            return true;
        return false;
    }

    public static boolean task_10(int n)
    {
        n = Math.abs(n);
       for(;n != 0; n /= 10)
            if(n % 10 == 2)
                return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Task №1");
        task_1();
        System.out.println("Task №2");
        task_2();
        System.out.println("Task №3");
        System.out.println(task_3(1,2,3));
        System.out.println(task_3(8,4,5));
        System.out.println("Task №4");
        System.out.println(task_4(1,2,3));
        System.out.println("Task №5");
        task_5(1,2,3);
        System.out.println("Task №6");
        task_6(10,15);
        System.out.println("Task №7");
        System.out.println(task_7(5));
        System.out.println(task_7(8));
        System.out.println("Task №8");
        System.out.println(task_8(5));
        System.out.println("Task №9");
        System.out.println(task_9(35));
        System.out.println(task_9(27));
        System.out.println("Task №10");
        System.out.println(task_10(253));
        System.out.println(task_10(365));

    }



}
