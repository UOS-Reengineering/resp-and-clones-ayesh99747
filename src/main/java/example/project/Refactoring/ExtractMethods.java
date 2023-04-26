package example.project.Refactoring;

public class ExtractMethods {

    /**
     * This is a method to reengineer using `extract methods` refactoring technique.
     *
     */
    public static void foo_before_refactoring() {
        // initialise an array of random numbers with the size of 10
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }

        // print the array with a given delimiter
        String delimiter = " ";
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + delimiter);
        }
        System.out.println();

        // initialise another array of random numbers with the size of 10
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
        }

        // print the array with a given delimiter
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + delimiter);
        }
        System.out.println();
    }

    public static void foo_after_refactoring() {


        // initialise an array of random numbers with the size of 10
        int[] array1 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array1, " ");

        // initialise another array of random numbers with the size of 10
        int[] array2 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array2, " ");
    }

    private static void printArrayWithDelimiter(int[] array, String delimiter) {
        // Print out the array values with a delimiter between the numbers.
        for (int j : array) {
            System.out.print(j + delimiter);
        }
        System.out.println();
    }

    private static int[] initialiseArray(int i) {
        // Create a new array with i number of random numbers
        int[] array = new int[i];
        for (int j = 0; j < i; j++) {
            array[j] = (int) (Math.random() * 10);
        }
        return array;
    }


}
