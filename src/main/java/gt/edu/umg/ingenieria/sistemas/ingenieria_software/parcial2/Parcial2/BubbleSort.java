package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.Parcial2;

public class BubbleSort {
    /**
     *Indicates when to change de min position
     * @param a
     */
    public void BubbleSort(String [] a)
    {
        for (int i = 0 ; i < a.length - 1 ; i++)
        {
            int minPos = Position(i,a);
            change (minPos, i,a);
        }
    }

    /**
     * Switch the position and compares to order the words
     * @param from
     * @param a
     * @return
     */
    private int Position(int from, String[]a)
    {
        String holder = a [from];
        int position = from;
        for (int i = from ; i < a.length ; i++)
        {
            if (a [i].compareTo (holder) < 0)
            {
                holder = a [i];
                position = i;
            }
        }
        return position;
    }

    /**
     * Makes the change in the positions between the words
     * @param i
     * @param j
     * @param a
     */
    private void change (int i, int j, String [] a)
    {
        String temp = a [i];
        a [i] = a [j];
        a [j] = temp;
    }
}