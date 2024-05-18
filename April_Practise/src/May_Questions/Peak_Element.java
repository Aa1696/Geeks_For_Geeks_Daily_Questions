package May_Questions;
import java.util.*;
public class Peak_Element {
    public int findPeakElement(List<Integer> a) {
        // Code here
        return a.stream().max(Integer::compareTo).get();
    }
}
