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
		int part = partition(a, 0, a.length-1);
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
	    int  k = 0;
	    while ((xc < x.length) && (yc < y.length))
	    {
	        if (x[xc].compareTo(y[yc])<0)
	        {
	            combo[k] = x[xc];
	            xc++;
	        }
	        else
	        {
	            combo[k] = y[yc];
	            yc++;
	        }
	        k++;
	    }
	    while (xc < x.length)
	    {
	        combo[k] = x[xc];
	        xc++;
	        k++;
	    }

	    while (yc < y.length)
	    {
	        combo[k] = y[yc];
	        yc++;
	        k++;
	    }
		return combo;
	}
	
	public static int partition(String[] x, int a, int b)
	{
		String P = x[a];
		int R = b;
		int L = a + 1;
		boolean Lb;
		boolean Rb;
		while(L<R-1)
		{
			while(x[L].compareTo(P)<0)
			{
				L++;
			}
			while(x[R].compareTo(P)>0)
			{
				R--;
			}
			swap(x, L, R);
		}
		swap(x, L, a);
		return L;
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
