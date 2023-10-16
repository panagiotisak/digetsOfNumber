package numberMethods;

public class doubleMethods {
	
	public static int doubleStringLength(double x) {
		int lenx;
		// TODO Auto-generated method stub
		
			String numx = Double.toString(x);//turn number to string
			lenx = numx.length();
		return lenx;
	}
	
	public static int doubleLength(double x) {
		int lenx;
		String numx = Double.toString(x);//turn number to string
		lenx = numx.length();
		return lenx-1;
	}
	
	public static double getNumber(double x,int i) {
		double z;
		double[] indexInteger;
		indexInteger = numberToArray(x);
		z =  indexInteger[i];
		return z;
	}

	public static double[] numberToArray(double  myNumber) {
		// TODO Auto-generated method stub
		double[] arrayOfmyNumber;
		String doubleString = Double.toString(myNumber);
		//turns my number to string
		int myNumberLength = doubleStringLength(myNumber);
		//gets my Numbers length
		arrayOfmyNumber = new double[myNumberLength];
		//makes an array with my number's length 
		for(int i=0;i<myNumberLength;i++)
		{
		char c = doubleString.charAt(i);
			if(Character.isDigit(c))//checks to see if its a number or the "." 
			{
				arrayOfmyNumber[i]=Character.getNumericValue(c);
				//store each string's index as a char and then turn it to integer and save it
				//at index i of an integer list
			}
			else//if its the "."
			{
				arrayOfmyNumber[i]=Math.pow(10, i + 1 - myNumberLength);
				/*we store to the last cell the appropriate power
				for e.x. 3.1415 the "." is at cell 1(i=1) with length 6
				so we want 10^-4 thus we want -(6-(i+1))*/
			}
		}
		rearrange(arrayOfmyNumber);
		return arrayOfmyNumber;		
	}
	
	private static double[] rearrange(double[] list) {
        double temp;
        int i = 0;

        // Find the first element less than 1
        while (list[i] >1||list[i]==1) {
            i++;
            if(list[i]<1)
            {
            	break;
            }
        }

        // Rearrange the elements less than 1 to the end
        while (i+1 < list.length) 
        {
             temp = list[i];
             list[i]=list[i+1];
             list[i+1]=temp;
             i++;
        }

        return list;
    }
}
