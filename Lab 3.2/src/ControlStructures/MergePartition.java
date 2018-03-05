package ControlStructures;

public class MergePartition {

	public static void main(String[] args)
	{   
		//merge() tests
		String[] x = {"a", "d", "g", "j", "m", "p", "s", "v", "y"};
		String[] y = {"b", "e", "h", "k", "n", "q", "t", "w", "z"};
		String[] z = {"c", "f", "i", "l", "o", "r", "u", "x"};
		
		//partition() tests
		String[] a = {"e", "d", "c", "b", "a"};
		String[] b = {"a", "b", "c", "d", "e"};
		String[] c = {"d", "b", "a", "e", "c"};
				
		long in = System.nanoTime();
		merge(x, y);
		long out = System.nanoTime();
		long time = out - in;
		for(String s : merge(x, y))
		{
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println("Merge took " + time + " nanoseconds");
		
		in = System.nanoTime();
		merge(x, z);
		out = System.nanoTime();
		time = out - in;
		for(String s : merge(x, z))
		{
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println("Merge took " + time + " nanoseconds");
		
		in = System.nanoTime();
		int part = partition(a);
		out = System.nanoTime();
		time = out - in;
		for(String s : a)
		{
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println("Pivot located at index " + part);
		System.out.println("Partition took " + time + " nanoseconds");
		
		
	}
	
	public static String[] merge(String[] x, String[] y)
	{
		String[] combo = new String[x.length + y.length];
		int xc = 0;
		int yc = 0;
		while(xc + yc < (x.length + y.length) - 1)
		{
			if(x[xc].compareTo(y[yc])>=0)
			{
				combo[xc + yc] = y[yc];
				yc++;
			}
			else
			{
				combo[xc + yc] = x[xc];
				xc++;
			}
		}
		return combo;
	}
	
	public static int partition(String[] x)
	{
		String P = x[0];
		int Piv = 0;
		int L = 1;
		int R = x.length-1;
		while(R > L)
		{
			while(x[R].compareTo(P)>=0)
			{	
				R--;
			}
			swap(x, Piv, R);
			Piv = R;
			while(x[L].compareTo(P)<=0)
			{		
				L++;
			}
			swap(x, Piv, L);
			Piv = L;
		}
		return Piv;
	}
	
	public static void swap(int[] a, int x, int y)
	{
		int s = a[x];
		a[x] = a[y];
		a[y] = s;
	}
	public static void swap(double[] a, int x, int y)
	{
		double s = a[x];
		a[x] = a[y];
		a[y] = s;
	}
	public static void swap(String[] a, int x, int y)
	{
		String s = a[x];
		a[x] = a[y];
		a[y] = s;
	}
}
