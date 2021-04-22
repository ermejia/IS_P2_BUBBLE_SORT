package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.Parcial2;

public class Printer {
    /**
     * Prints the Bubble sort Array
     * @param arr
     */
    void printArrayOrder(String[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
