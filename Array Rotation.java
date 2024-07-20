public class ArrayRotation {
    public static void main(String[] args) {
        // Initialize the array and the number of rotations
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        // Call the rotLeft method to rotate the array
        int[] result = rotLeft(a, d);

        // Print the rotated array with space-separated elements
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
    }

    // Method to rotate the array to the left by d positions
    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        // Ensure d is within the range of the array size
        d %= n;
        // Create a new array to hold the rotated elements
        int[] rotatedArray = new int[n];

        // Copy the elements after rotation position to the start of the new array
        for (int i = 0; i < n - d; i++) {
            rotatedArray[i] = a[i + d];
        }
        
        // Copy the elements before rotation position to the end of the new array
        for (int i = 0; i < d; i++) {
            rotatedArray[n - d + i] = a[i];
        }

        return rotatedArray;
    }
}
