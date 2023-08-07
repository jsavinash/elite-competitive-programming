import java.util.Arrays;

public class MoveZeros {
  int[] moveZeros(int[] nums) {
    int count = 0;
    int currentElement = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[currentElement] = nums[i];
        currentElement++;
      } else {
        count++;
      }
    }
    for (int j = nums.length - count; j < nums.length; j++) {
      nums[j] = 0;
    }
    return nums;
  }

  public static void main(String[] args) {
    MoveZeros mz = new MoveZeros();
    int[] arr = { 0, 1, 0, 3, 12 };
    System.out.println(Arrays.toString(mz.moveZeros(arr)));
  }
}