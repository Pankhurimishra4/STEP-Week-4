import java.util.Arrays;
import java.util.Scanner;

 class rotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of songs: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        if (n > 0) {
            System.out.println("Enter the song IDs/playlist elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of positions to rotate (k): ");
        int k = scanner.nextInt();

        int[] rotated = rotateArray(nums, k);

        System.out.println("Rotated Playlist: " + Arrays.toString(rotated));

        scanner.close();
    }

    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int length = nums.length;
        k = k % length;

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[(i + k) % length] = nums[i];
        }

        return result;
    }
}