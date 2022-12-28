package exam;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class _1Test {


    @Test
    void name() {
        String[] a = new String[]{"are"};
        String[] b = new String[]{"are", "you?"};
        System.out.println("----------");
        System.out.println(solution(a, b));
        System.out.println("----------");

    }

    public String solution(String[] leftArray, String[] rightArray) {
        if (leftArray.length <= 0 && rightArray.length <= 0) return "";

        HashSet<String> map = new HashSet<>(Arrays.asList(leftArray));
        List<String> result = new ArrayList<>();

        for (String s : rightArray) {
            if (map.contains(s)) {
                result.add(s);
            }
        }
        return result.stream()
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    @Test
    void name2() {


    }

    public String[] solution2(String[] productInfo, String[] dailyProductSales) {

        Map<String, Product> productMap = Arrays.stream(productInfo).map(p -> {
            String[] split = p.split(",");
            String id = split[0];
            String name = split[1];
            int price = Integer.parseInt(split[2]);
            return new Product(id, name, price);
        }).collect(Collectors.toMap(k -> k.id, v -> v));

        String[] answer = new String[dailyProductSales.length];

        for (int i = 0; i < dailyProductSales.length; i++) {
            String dailyProductSale = dailyProductSales[i];
            String[] split = dailyProductSale.split(",");
            String date = split[0];
            String id = split[1];
            int count = Integer.parseInt(split[2]);

            Product product = productMap.get(id);
            int totalPrice = product.getPrice() * count;
            answer[i] =
                    date + "," + product.getId() + "," + product.getName() + "," + totalPrice;
        }

        return answer;
    }

    private static class Product {
        private final String id;
        private final String name;
        private final int price;

        public Product(String id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
