import java.util.Random;

public class AlgorithmicComplexityAnalyzer {

    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Quadratic Operation - O(N^2) (Checking duplicate pairs)
    public static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int inputSize = 50000;
        int[] dataset = new int[inputSize];
        Random random = new Random();

        for (int i = 0; i < inputSize; i++) {
            dataset[i] = random.nextInt(100000);
        }

        System.out.println("=== Algorithmic Complexity Benchmarker ===");
        System.out.println("Dataset Size: " + inputSize + " elements\n");

        // Benchmark O(N)
        long startTime = System.nanoTime();
        linearSearch(dataset, -1); // Worst-case search
        long endTime = System.nanoTime();
        double linearTimeMs = (endTime - startTime) / 1_000_000.0;
        System.out.printf("O(N) Linear Search Execution Time    : %.3f ms\n", linearTimeMs);

        // Benchmark O(N^2)
        startTime = System.nanoTime();
        hasDuplicates(dataset);
        endTime = System.nanoTime();
        double quadraticTimeMs = (endTime - startTime) / 1_000_000.0;
        System.out.printf("O(N^2) Duplicate Check Execution Time: %.3f ms\n", quadraticTimeMs);
    }
}