package ControlStructures;

public class MergePartition {

	public static String[] merge(String[] x, String[] y)
	{
		String[] combo = new String[x.length + y.length];
		int xc = 0;
		int yc = 0;
		while(xc + yc < (x.length + y.length) - 2)
		{
			if(x[xc].compareTo(y[yc])>=0)
			{
				combo[xc + yc] = y[yc];
				yc++;
			}
			if(x[xc].compareTo(y[yc])<0)
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
		int R = x.length;
		while(R > L)
		{
			while()
			{	
				if(x[R].compareTo(P)>=0)
				{
					R--;
				}
			}
			swap(x, Piv, R);
			Piv = R;

				if(x[L].compareTo(P)>0)
				{
					swap(x, Piv, L);
					Piv = L;
				}
			}
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
