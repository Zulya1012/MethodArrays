public class ArrayMethods {

  public static void main(String[] args) {
    int[] numbers = {
      5,
      2,
      8,
      10,
      1
    };
    sortArray(numbers);
    showArray(numbers);
    System.out.println();
    int sum = findSum(numbers);
    System.out.println("Sum of array elements: " + sum);

    int max = findMax(numbers);
    System.out.println("Maximum array element: " + max);

    int min = findMin(numbers);
    System.out.println("Minimum array element: " + min);

    double average = findAverage(numbers);
    System.out.println("Average of array elements: " + average);

    squareElements(numbers);
    System.out.print("Squared array: ");
    for (int num: numbers) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void sortArray(int[] num) {
    for (int i = 0; i < num.length; i++) {
      for (int j = 1; j < num.length; j++) {
        if (num[j - 1] > num[j]) {
          int min = num[j];
          num[j] = num[j - 1];
          num[j - 1] = min;
        }
      }
    }
  }

  public static void showArray(int[] numbers) {
    System.out.print("Sorted array: ");
    for (int num: numbers) {
      System.out.print(num + ",");
    }
  }

  public static int findSum(int[] arr) {
    int sum = 0;
    for (int num: arr) {
      sum = sum + num;
    }
    return sum;
  }

  public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static double findAverage(int[] arr) {
    int sum = findSum(arr);
    return (double) sum / arr.length;
  }

  public static void squareElements(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }
  }
}
