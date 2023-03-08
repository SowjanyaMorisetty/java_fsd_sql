/**
 * 
 */
package new1;

/**
 * @author Administrator
 *
 */
public class First {
	

	/**
	 * @param args
	 */
	public static boolean isPrime(int n)
	{
		int count=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count = 1;
			}
			
		}
		if(count==0)
		{
			return true;
		}
		else
			
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(2));

	}

}
