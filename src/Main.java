public class Main {
    public static void printStr(String toPrint) {
        System.out.println(toPrint);
    }


    public static void main(String[] args) {
        //Demonstrate array creation:

        //with predefined size, with size defined in a variable, literal array creation
        int size = 21;
        int[] a = new int[10];
        int[] b = new int[size];
        int[] c = {1, 3, 2, 7, 8};

        //different types for array elements (int, double, String, char, boolean)
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        double[] doubleArray = {0.10, 1.45, 6.01, 1.1};
        String[] stringArray = {"apple", "banana", "pear", "pineapple"};
        char[] charArray = {'D', 'a', 'r', 'i', 'a'};
        boolean[] booleanArray = {true, false, false, true};
        //array.length
        System.out.println("intArray length is: " + intArray.length);
        // assign value to array element
        a[4] = 45;
        //print array element value
        System.out.println("The first element value: " + doubleArray[0]);


        //error of accessing array element by non-existing index: a[1000]
        System.out.println((c[100]));

        // Iterate over array (array traversal):

        //for loop to traverse an array
        String fruits = "";
        for (int i = 0; i < stringArray.length - 1; i++) {
            fruits += stringArray[i] + ", ";
        }
        printStr("You need to buy these fruits: " + fruits + stringArray[stringArray.length - 1]);
        //the enhanced for loop to traverse array
        for (double number : doubleArray) {
            System.out.print(number);
            System.out.print(" ");
        }
        printStr("");
        //while loop to traverse an array
        int i = 0;
        while (i < charArray.length) {
            System.out.print(charArray[i]);
            i++;
        }

    }
}