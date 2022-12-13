package _0x0F_sort2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_10814_나이순정렬 {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        Person[] Persons = new Person[N];
        for (int i = 0; i < N; i++) {
            String[] aa = sc.nextLine().split(" ");
            Persons[i] = new Person(aa[1], Integer.parseInt(aa[0]));
        }


        Arrays.sort(Persons, Person.comparator);

        for (Person person : Persons) {
            System.out.println(person.age + " " + person.name);
        }
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        private static final Comparator<Person> comparator = Comparator.comparingInt(o -> o.age);
    }

}
