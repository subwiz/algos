package permute;

public class CharSwappingPermutation implements Permutation {
    
    private void swap(char[] arr, int a, int b) {
        char t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
        System.out.printf("swap %s, %s >> %s\n", a, b, new String(arr));
    }
    
    private void permute(char[] arr, int l, int r) {
        if(l == r) {
            System.out.println(new String(arr));
        }
        else {
            for(int i=l; i<r; i++) {
                System.out.printf("i: %s / l: %s / r: %s\n", i, l, r);
                swap(arr, l, i);
                System.out.println("1>>" + new String(arr));
                permute(arr, l+1, r);
                swap(arr, l, i);
                System.out.println("2>>" + new String(arr));
            }
        }
    }

    @Override
    public void dispPermutes(String input) {
        permute(input.toCharArray(), 0, input.length());
    }
}
