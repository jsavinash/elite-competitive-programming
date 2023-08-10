class HighestAltitude {
    int highestAltitude(int[] arr) {
        int maxAltitude = 0;
        int totalGain = 0;
        for (int x : arr) {
            totalGain += x;
            maxAltitude = Math.max(maxAltitude, totalGain);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        HighestAltitude ha = new HighestAltitude();
        int[] arr = { -5, 1, 5, 0, -7 };
        System.out.println(ha.highestAltitude(arr));
    }
}