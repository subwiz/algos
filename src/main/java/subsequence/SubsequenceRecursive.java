package subsequence;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author subhash
 */
public class SubsequenceRecursive implements Subsequence {
    
    private List<String> subseq(String input) {
        List<String> out = new LinkedList<>();
        if(input.length() == 0) {
            return out;
        }
        
        char selChar = input.charAt(0);
        String rem = input.substring(1);
        List<String> res = subseq(rem);
        // add results without selected char:
        out.addAll(res);
        // add results with selected char:
        out.add(String.valueOf(selChar));
        for(String ss: res) {
            out.add(selChar + ss);
        }
        return out;
    }

    @Override
    public List<String> getAllSubsequence(String input) {
        return subseq(input);
    }
    
}
