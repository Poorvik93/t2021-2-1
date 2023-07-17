import java.util.*;


public class Program_4 {
    public static Map<Integer, Integer> countMultiples(int[] numbers, int[] factors) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int factor : factors) {
            countMap.put(factor, 0);
        }

        for (int number : numbers) {
            for (int factor : factors) {
                if (number % factor == 0) {
                    countMap.put(factor, countMap.get(factor) + 1);
                }
            }
        }
        return countMap;
    }

    public static void main(String[] args) {
        int[] inputNumbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] inputFactors = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Map<Integer, Integer> result = countMultiples(inputNumbers, inputFactors);
        System.out.println(result);
    }
}
