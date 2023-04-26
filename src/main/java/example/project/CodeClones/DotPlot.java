package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {

        // Printing out the first line of characters in sequence2.
        System.out.print("\t");
        for (int j = 0; j < sequence2.length; j++) {
            System.out.print(sequence2[j] + "\t");
        }
        System.out.println();

        // Iterate through both sequences.
        for (int i = 0; i < sequence1.length; i++) {
            System.out.print(sequence1[i] + "\t"); // Printing out the first sequence in each row,
            for (int j = 0; j < sequence2.length; j++) {
                if (sequence1[i] == sequence2[j]) {
                    System.out.print("+\t"); // If there is a match print out a +.
                } else {
                    System.out.print(" \t"); // If there is no match print out a ' '.
                }
            }
            System.out.println();
        }
    }

}
