package numberMethods;

public class integerMethods {
	public static int integerLength(int x) {
		int lenx;
		String numx = Integer.toString(x);//turn number to string
		lenx = numx.length();
		return lenx;
	}
	
	public static int getIntegerDigit(int x,int i) {
		// TODO Auto-generated method stub
		int z;
		int[] indexInteger;
		indexInteger = numberToArray(x);
		z= indexInteger[i];
		return z;
	}


	public static int[] numberToArray(int  myNumber) {
		// TODO Auto-generated method stub
		    int[] arrayOfmyNumber;
			String integerString = Integer.toString(myNumber);
			//turns my number to string
			int myNumberLength = integerString.length();
			//gets my Numbers length
			arrayOfmyNumber = new int[myNumberLength];
			//makes an array of integers with my numbers length
			for(int i=0;i<myNumberLength;i++)
			{
				char c = integerString.charAt(i);//store each string's index as a character
				int y = Character.getNumericValue(c);// and then turn it to integer
				arrayOfmyNumber[i]=y;
				//at index i of an integer list
			}
		return arrayOfmyNumber;
	}
}
