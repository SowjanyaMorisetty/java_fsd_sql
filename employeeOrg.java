/**
 * 
 */
package employee;

/**
 * @author Administrator
 *
 */
public class employeeOrg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeOrg o=new employeeOrg();
		System.out.println(o.gettingCoins(256));

	}
	
	public static int gettingCoins(int n)
	{
		if(n>=1&&n<=80)
		{
			return 5;
		}
		else if(n>=81&&n<=172)
		{
			return 3;
		}
		else if(n>=172&&n<=266)
		{
			return 1;
	    }
		else
		{
			return 0;
		}

}
}
