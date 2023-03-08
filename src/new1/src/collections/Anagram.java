/**
 * 
 */
package collections;

/**
 * @author Administrator
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="listen";
		String s1="silent";
		int count1=0;
		int count2=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			
			char ch=s.charAt(i);
			for(int j=0;j<=s1.length()-1;j++)
			{
				char ch1=s1.charAt(j);
				if(ch==ch1)
				{
					ch1++;
					count1++;
				}
				
			}
			count2++;
		}
		if(count1==count2)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}

	}

}
