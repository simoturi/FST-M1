import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int num[] = {10,5,9,4,2};
		ascendingsort(num);
		System.out.println("Ascending order of numbers are:- ");
		System.out.println(Arrays.toString(num));
	}

	private static void ascendingsort(int[] num) {
		
		int k = num.length,i;
		
		for(i=1; i<k; i++)
		{
			int l = num[i];
			int j = i - 1;
			
			while (j>=0 && l<num[j])
			{
				num[j+1]= num[j];
				--j;
			}
			num[j+1]=l;
		}
		
		
	}

}
