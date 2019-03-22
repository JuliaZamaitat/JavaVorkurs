/*This class takes an array and allows various calculations on it.
 */
public class FindMaxMin{
    static int arr[] = {10, 324, 45, 90, 9808, 2, 199, 3, 22, 1188};

    public static void main(String[] args) {
        System.out.println("Largest in given array is " + findMax());
        System.out.println("Smallest in given array is " + findMin());
        System.out.println("The sum of every number is:  " + sum());
        System.out.println("The number 45 appears: " + howOften(45) + " times.");
    }

    // Method to find maximum in arr[]
    public static int findMax() {
        int i;
        int max = arr[0];
        // Traverse array elements from second and compare every element with current max
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    // Method to find min in arr[]
    public static int findMin() {
        int i;
        int min = arr[0];
        // Traverse array elements from second and compare every element with current min
        for (i = 1; i < arr.length; i++){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    //method to calculate the sum of an array
    public static int sum() {
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int howOften(int number){
        int i;
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == number) count++;
        }
        return count;
    }
}

