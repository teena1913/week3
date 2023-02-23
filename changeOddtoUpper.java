package week3.day1;


public class changeOddtoUpper {

	public static void main(String[] args) {
		String test="changename";
		char[] charArray = test.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{
				
		charArray[i]=Character.toUpperCase(charArray[i]);
		System.out.print(charArray[i]);
			}
			else {
				System.out.print(charArray[i]);
			}
		

	
		}

	


}
}