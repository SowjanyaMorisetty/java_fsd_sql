/**
 * 
 */
package UST_BATCHNO3.JUNIT5_TESTCASES;

/**
 * @author Administrator
 *
 */
public class CountingVowels {

	/**
	 * @param args
	 * @return 
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingVowels v=new CountingVowels();
		String s1="iuoiu";
		System.out.println(CountingVowels.vowelCount(s1));
	}



public static int vowelCount(String s)
{
	
    
	    int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			count++;
			}
		}
		return count;
	

	}

}

