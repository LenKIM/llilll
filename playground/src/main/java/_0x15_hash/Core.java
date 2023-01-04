package _0x15_hash;


import java.util.TreeMap;

public class Core {

    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("1", 2);
        map.put("1", 4);


        System.out.println(map);

    }

    private static class Pair<L, R> {

        L left;
        R right;

        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }
    }
}
