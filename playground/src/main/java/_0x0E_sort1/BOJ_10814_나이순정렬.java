package _0x0E_sort1;

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

        static Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //1순위가 나이 / 나이가 같으면 가입한 순으로 한 줄에 한 명씩
                return o1.age - o2.age;
            }
        };
    }
}


