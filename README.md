# Array_-Rotation
Assignment

## Understanding the Code
- The `Array_-Rotation` class contains the main method where the program execution starts.
- Inside the `main` method, an array `a` is initialized with some integer values, and a variable `d` is set to determine the number of rotations.
- The `rotLeft` method is called with the array `a` and rotation count `d`, which returns a new array containing the rotated elements.
- The rotated array is printed to the console, with elements separated by spaces.

## Method Explanation: `rotLeft`
- This method takes two parameters: an integer array `a` and an integer `d` representing the number of left rotations.
- It calculates the effective number of rotations by taking the modulo of `d` with the length of the array to ensure it's within the range of array size.
- A new array `rotatedArray` is created to hold the rotated elements.
- The elements after the rotation position are copied to the start of the new array, and the elements before the rotation position are copied to the end of the new array.
- The rotated array is returned.

## Example
- Input:
- int[] a = {1, 2, 3, 4, 5};
  int d = 4;
## OUTPUT
  5 1 2 3 4
  The array `[1, 2, 3, 4, 5]` is rotated to the left by 4 positions, resulting in `[5, 1, 2, 3, 4]`.

  reference: Hacker Ranks.
  
