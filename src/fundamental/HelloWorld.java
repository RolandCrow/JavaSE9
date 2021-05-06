package fundamental;

import javax.naming.InsufficientResourcesException;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World".length());
        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
        int n = 42;
        String str = Integer.toString(n);
        System.out.println(str);
        String str2 = "1010110";
        int n2 = Integer.parseInt(str2);
        Scanner in = new Scanner(System.in); // ввод  клавиатуры
        System.out.println("What's your name");
        String name = in.nextLine(); // если несколько
        String firstName = in.next(); // если одно слово

        String[] names = new String[100]; // массив в 100 элементов
        Arrays.fill(names, "");
        ArrayList<String> friends = new ArrayList<>(List.of("Peter", "Paul"));
        friends.remove(0);
        friends.add(0, "Paul");
        String first = friends.get(0);
        friends.set(0, "Mary");
        for(int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i)); // перечисление
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        int first2 = numbers.get(0);

        int sum = 0;
        for(int n3: numbers) {
            sum += n3;
        }

        ArrayList<String> people = friends;
        people.set(0, "Mary");
        ArrayList<String> copiedPeople = new ArrayList<>(friends);

        Arrays.sort(names);
        Collections.sort(friends);

        int [] [] square = { // двумерный массив
                {16,3,2,13},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1}
        };

        int element = square[1][2];

        int [] [] triangle = new int[n][]; // треугольник паскаля
        for(int i = 0;i < n ;i++) {
            triangle[i] = new int [i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for(int j = 1; j< i; i++ ) {
                triangle[i][j] = triangle[i -1][j -1] + triangle[i -1][j];

            }
        }
        for(int [] row : triangle) {
            for(int element2 : row) {
                System.out.printf("%4d", element2);
            }

            System.out.println();
        }











    }

    public static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    public static int[] firstLast(int[] values) {
        if(values.length == 0) return new int[0];
        else return new int[] {values[0], values[values.length - 1]}; // возвращаем строки
    }

    public static double max(double first, double... rest) {
        double result = first;
        for(double v: rest) result = Math.max(v, result);
        return result;
    }

}
