package sets;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author subhash
 */
public class AllSubSetsOfASetImpl implements AllSubSetsOfASet {
    
    private Set<List<Integer>> subSet(List<Integer> input) {
        Set<List<Integer>> out = new HashSet<>();
        if(input.isEmpty()) {
            out.add(new LinkedList<>());
            return out;
        }
        
        List<Integer> copy = new LinkedList<>(input);
        Integer firstEl = copy.remove(0);
        Set<List<Integer>> res = subSet(copy);
        for(List<Integer> l: res) {
            List<Integer> newL = new LinkedList<>();
            newL.add(firstEl);
            newL.addAll(l);
            out.add(newL);
            out.add(l);
        }
        
        return out;
    }

    @Override
    public Set<List<Integer>> subSetsOf(List<Integer> input) {
        return subSet(input);
    }
    
}
