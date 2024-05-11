package May_Questions;
import java.util.*;
public class Jugglers_Series {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> res = new ArrayList<>();
        res.add(n);
        while(n != 1){
            if((n&1) == 1){
                n = (long)Math.floor(Math.pow(n, 1.5));
            }else{
                n = (long)Math.floor(Math.pow(n, 0.5));
            }
            res.add(n);
        }
        return res;
    }
}
