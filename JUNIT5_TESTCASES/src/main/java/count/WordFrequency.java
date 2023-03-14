/**
 * 
 */
package count;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class WordFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WordFrequency w=new WordFrequency();
       List<String> s=new ArrayList<String> (Arrays.asList("hi","ji","hello","hi"));
       System.out.println(w.countWords(s));
	}
	
	public static List<Integer> countWords(List<String> s)
	{
		List<Integer> l=new ArrayList<Integer>();
		
		int count1=0;
	    
		String[] s3=s.toArray(new String[0]);
		
		for(int i=0;i<=s3.length-1;i++)
		{
		
			String s1=s3[i];
			count1=0;
			for(int j=0;j<=s3.length-1;j++)
			{
				String s2=s3[j];
			
			if(s1.equals(s2))
			{
				count1++;
			}
		}
			
			l.add(count1);
		}
			
		return l;	
		
		
	}
	

}
