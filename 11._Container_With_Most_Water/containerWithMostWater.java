class ContainerWithMostWater {
    int containerWithMostWater(int[] waterHeight) {
        int lPtr = 0;
        int rPtr = waterHeight.length - 1;
        int maxArea = 0;
        while(lPtr < rPtr) {
            int currentMaxArea = Math.min(waterHeight[lPtr], waterHeight[rPtr]) * (rPtr - lPtr);
            maxArea = Math.max(maxArea, currentMaxArea);
            if(waterHeight[lPtr] < waterHeight[rPtr]) {
            lPtr++;
            } else {
            rPtr--;
            }
        }
       return maxArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWater cmw = new ContainerWithMostWater();
        int[] waterHeight = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(cmw.containerWithMostWater(waterHeight));

    }
}