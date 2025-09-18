import java.lang.*;
import java.util.Scanner;
class StudentMarks
{
	static void bubbleSort(int A[])
	{
		int temp = 0;
		for (int k=0; k<A.length; k++)
		{
			for(int j=k+1; j<A.length; j++)
			{
				if (A[k]>A[j])
				{
					temp = A[k];
					A[k] = A[j];
					A[j] = temp;
				}
			}
		}
	}
	public static void main(String s[])
	{
		int A[] = new int[8];
		int x;
		int n= A.length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student marks : ");
		for(int i=0; i<n; i++)
		{
			A[i]=sc.nextInt();
		}
		bubbleSort(A);
		float bottomSum = 0, topSum = 0;
        for (int i = 0; i < 3; i++) 
        {
            bottomSum += A[i];
        }
        float bottomAvg = bottomSum / 3;
        for (int i = n - 3; i < n; i++) 
        {
            topSum += A[i];
        }
        float topAvg = topSum / 3;
		float diff = topAvg - bottomAvg;
		System.out.print("Diffrence is :"+diff);
	}
}

