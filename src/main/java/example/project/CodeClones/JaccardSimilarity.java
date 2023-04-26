package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        int intersectionSize = 0; // A ∩ B
        int unionSize = set1.size() + set2.size(); // A ∪ B
        for (String str : set1) {
            // Iterating through each string in the set to see if there are similar strings.
            if (set2.contains(str)) {
                // If the string is present in both sets.
                intersectionSize++;
                unionSize--;
            }
        }
        /*
            Jaccard Similarity = (A ∩ B) / (A ∪ B)
         */
        return (double) intersectionSize / unionSize;
    }

}
