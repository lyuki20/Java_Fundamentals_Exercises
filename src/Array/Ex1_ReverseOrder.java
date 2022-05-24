package Array;

public class Ex1_ReverseOrder {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Array: ");
        int count = 0; //Loop counter
        while (count < (array.length)) {  // While the counter is < than the array's lenght, do
            System.out.println(array[count]); // Prints the position "count" of the array
            count++; // count = count + 1, so the next position of the array will be +1
        }
        System.out.println("Array: ");
        for(int i = (array.length - 1); i >= 0; i --) {
            System.out.println(array[i] + " ");


        }
    }
}
