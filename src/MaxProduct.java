
public class MaxProduct {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, -7, 5, 8, -5};

        maxProduct(arr);

    }

    static void maxProduct(int[] arr) {

        int max = 1;
        int secondMax = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < max) {
                secondMax = arr[i];
            }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secondMax && arr[j] < max) {
                  secondMax = arr[j];
              }
            }
        }
        System.out.println("The pair are: " + "( " + secondMax + ", " + max + " )");
        System.out.println("The maximum product is: " + (secondMax * max));
    }
}
