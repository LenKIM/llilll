package _0x11_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399_ATM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            people[i] = new Person(i, Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(people);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum += people[j].wait;
            }
        }
        System.out.println(sum);
    }

    static class Person implements Comparable<Person> {
        int index;
        int wait;

        public Person(int index, int wait) {
            this.index = index;
            this.wait = wait;
        }

        @Override
        public int compareTo(Person o) {
            return Integer.compare(this.wait, o.wait);
        }

        @Override
        public String toString() {
            return wait + "";
        }
    }
}
