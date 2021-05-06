package fundamental.exercises;


import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Print three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a > b && a > c) {
            System.out.println("a - the largest number");
        } else if(b > a && b > c) {
            System.out.println("b - the largest number");
        } else if (c > a && c > b) {
            System.out.println("c - the largest number");
        }



        int max = Math.max(a, b);
        int max2 = Math.max(max, c);
        System.out.println(max2);

        Scanner in2 = new Scanner(System.in);
        System.out.println("Print three numbers");
        double d = in2.nextDouble();
        double e = in2.nextDouble();
        double f = in2.nextDouble();

        double max3 = Math.max(d,Math.max(e,f));
        System.out.println(max3);

        double min = Math.min(d,Math.min(e,f));
        System.out.println(min);

            int h = 1000;
            int result = 1;
            for (int i = 1; i <= h; i++) {
                result = result * i;
                Integer integer = Integer.valueOf(result);
                System.out.println(integer);
            }






        Scanner in3 = new Scanner(System.in);
        System.out.println("Print two numbers from zero to 4294967295");

        int one = in3.nextInt();
        int two = in3.nextInt();

        int positiveOne = Math.abs(one);
        int positiveTwo = Math.abs(two);

        int sum = positiveOne + positiveTwo;
        int dif =  positiveOne - positiveTwo;
        int product = positiveOne * positiveTwo;

        int quotient = 1;

        if(positiveTwo != 0) {
            quotient = positiveOne / positiveTwo;
        } else  {
            System.out.println("На ноль делить нельзя");
        }

        int remainder = positiveOne % positiveTwo;

        System.out.println("Сумма чисел " + sum + "\n"
                + " Разница чисел " + dif + "\n"
                + " Произведение " + product + "\n"
                + " Частное " + quotient + "\n"
                + " Остаток" + remainder
        );


        Scanner in5 = new Scanner(System.in);
        System.out.println("Напишите предложение с пробелами");
        String str = in.toString().trim();
        System.out.println(str);















    }
}
