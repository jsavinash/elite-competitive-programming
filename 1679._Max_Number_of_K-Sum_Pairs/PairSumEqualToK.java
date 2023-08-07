import java.util.Map;
import java.util.HashMap;

class PairSumEqualToK {
    int pairSumEqualToK(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(k - arr[i]) && mp.get(k - arr[i]) > 0) {
                count++;
                mp.put(k - arr[i], mp.get(k - arr[i]) - 1);
            } else {
                mp.put(arr[i], mp.getOrDefault(k - arr[i], 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PairSumEqualToK psq = new PairSumEqualToK();
        int[] arr = { 1, 2, 3, 4 };
        int k = 5;
        System.out.println(psq.pairSumEqualToK(arr, k));

    }
}