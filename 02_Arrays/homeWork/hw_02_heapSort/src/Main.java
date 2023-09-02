import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        int[] myArray = {11,15};
        System.out.println(Arrays.toString(myArray));
        makeHeap(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void makeHeap(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            while (true)
            {
                //find parent index
                int parentIndex = (index - 1) / 2;
                // If value less or equal its parent value, loop have to be broken
                if (array[index] <= array[parentIndex])
                    break;

                // swap value and parent value
                int temp = array[index];
                array[index] = array[parentIndex];
                array[parentIndex] = temp;
            }
        }
    }
}