import java.util.*;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> words = new ArrayList<>(List.of("Misha", "Misha", "Michael", "Michael", "Ivan"));

    public static void main(String[] args) {

// Task 1
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println("num = " + num);
            }
        }
        System.out.println();
// Task 2
        Collections.sort(nums);
        int prefNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prefNum) {
                System.out.println("num = " + num);
                prefNum = num;
            }
        }
        System.out.println();
// Task 3
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("uniqueWords = " + uniqueWords);
        System.out.println();
// Task 4
        System.out.println("words.size() = " + (words.size() - uniqueWords.size()));
    }
}




