package permute;

/**
 *
 * @author subhash
 */
public class CharMovePermutation implements Permutation {
    
    private void permute(String prefix, String str) {
        if("".equals(str)) {
            System.out.println(prefix);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char selChar = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i+1);
            permute(prefix + selChar, rem);
        }
    }

    @Override
    public void dispPermutes(String input) {
        permute("", input);
    }
    
}
