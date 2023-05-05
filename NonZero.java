package bridgepractice;

import java.util.Arrays;

public class NonZero {
	
	public static void main (String [] args)
	{
		int [] a1 = {3,0,5,9,0,7,0,1};
		
		int [] nZeros = new int [ a1.length];
		int [] zeros = new int [a1.length];
		

		int zeroCount = 0;
		
		for (int i =0; i<a1.length; i++)
		{
			if (a1[i] == 0)
			{
				zeros[zeroCount++] = a1[i];
			}
			else
			{
				int nZeroCount = 0;
				nZeros[nZeroCount++] = a1[i];
			}
			
		}
		
		int nZeroCount = 0;
		for (int i =0; i<nZeroCount-1; i++ )
		{
			for(int j =0; j<nZeroCount-i-1 ; j++)
			{
				if (nZeros[j] > nZeros[j+1])
				{
					int temp = nZeros[j];
					nZeros[j] = nZeros[j+1] ;
					nZeros [j+1] = temp;
				}
			}
		}
		
		int [] sortArray = new int [a1.length];
		System.arraycopy(nZeros,0,sortArray,0,nZeroCount);
		System.arraycopy(zeros,0,sortArray,nZeroCount,zeroCount);
		
	
		int [] finalArray = new int[nZeroCount];
		System.arraycopy(sortArray,0,finalArray,0, nZeroCount );
		
		System.out.println(Arrays.toString(finalArray));
		
	}
}
