/**
 * 
 */
package count;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class WordsCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordsCount w=new WordsCount();
		
		List<String> s=new ArrayList<String> (Arrays.asList("hi","ji","hello","hi"));
		String s2="hi";
		System.out.println(countWords(s,s2));
	}
		public static int countWords(List<String> s,String s2)
		{
			
			int count=0;
			String[] s3=s.toArray(new String[0]);
			
//			List<String> l=new ArrayList<String>();
//			List<Integer> l1=(List<Integer>) l.stream().filter(t->t..contains("hi"));
			for(int i=0;i<=s3.length-1;i++)
			{
				String s1=s3[i];
				
				if(s1.equals(s2))
				{
					count++;
				}
			}
			return count;
		}

	

}
