/**
 * Copyright Adrienne Bienapfl 2016
 */

/**
 * @author Adrienne Bienapfl
 *
 */
public class InsertionSort
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] vals = new int[args.length];
		for (int i = 0; i < args.length; i++)
		{
			vals[i] = new Integer(args[i]);
		}
		sort(vals);

		for (int i = 0; i < vals.length; i++)
		{
			System.out.println(vals[i]);
		}
	}

	// swaps array location of two indexes given
	public static void swap(int[] vals, int a, int b)
	{
		int temp = vals[a]; // copy first value to temp to save
		vals[a] = vals[b]; // put second value in index of the first
		vals[b] = temp; // put original value where the second value was.
	}

	// sorts the array given in place
	public static void sort(int[] vals)
	{
		int sortedIndex = 0;
		while (sortedIndex < vals.length - 1)
		{
			if (vals[sortedIndex] > vals[sortedIndex + 1])
			{
				swap(vals, sortedIndex, sortedIndex + 1);
				int k = sortedIndex - 1;
				while (vals[k] > vals[k + 1] && k >= 0)
				{
					swap(vals, k, k + 1);
					k--;
				}
			}
			sortedIndex++;
		}
	}
}
