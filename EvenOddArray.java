//Take One Arraylist a{2,4,5,3,1,9} with the help of for each loop and assingn the value in an evenarray and oddarray in assending Order

import java.util.ArrayList ;

public class EvenOddArray
{
	public static void main (String [] args)
	{
		ArrayList<Integer> a = new Arraylist<Integer> ();
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(3);
		a.add(1);
		a.add(9);

		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		ArrayList<Integer> oddArray = new ArrayList<Integer>();

		for (int i=0; i<a.size(); i++)
		{
			int num = a.get(i);
			if (num%2 == 0)
			{
				evenArray.add(num);
			}
			else
			{
				oddArray.add(num);
			}
		}
		
		System.out.println("Original Array : " +a);
		System.out.println("Even Array : " +evenArray);
		System.out.println("Odd Array : " +oddArray);
	}
}
		