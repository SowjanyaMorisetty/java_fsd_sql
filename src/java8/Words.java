/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * @author Administrator
 *
 */
public class Words {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String s1="hi hello hi welcome to world";
		
		String[] article=s1.split("[,:;.?! ]");
		List<String> wordsCount=Arrays.stream(article).filter(t->!t.isEmpty()).collect(Collectors.toList());
				
		List<String> uniqueWords=wordsCount.stream().map(s->s.toLowerCase()).distinct().sorted().collect(Collectors.toList());
				
				
				System.out.println("the words count are:"+wordsCount.size());
				System.out.println("the unique words count are:"+uniqueWords.size());
				System.out.println("the unique words c are:"+uniqueWords);
								
				
				

}
}