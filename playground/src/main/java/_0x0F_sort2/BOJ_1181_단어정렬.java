package _0x0F_sort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class BOJ_1181_단어정렬 {
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }
        ArrayList<String> integerArrayList = new ArrayList<>(hashSet);
        integerArrayList.sort(stringComparator);
        Iterator iterator = integerArrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static final Comparator<String> stringComparator = (o1, o2) -> {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else if (o1.length() == o2.length()) {
            return o1.compareTo(o2);
        } else {
            return 0;
        }
    };
}
