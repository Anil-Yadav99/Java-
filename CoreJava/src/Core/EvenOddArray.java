package Core;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.println("Even:" +arr[i]);
			else
				System.out.println("Odd:" +arr[i]);	
		}
			
	}

}
