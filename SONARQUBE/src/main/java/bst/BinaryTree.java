package bst;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Optional;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(10);
		l.add(5);
		l.add(100);
		l.add(65);
		int k=2;
		Optional<Integer> l1=l.stream().distinct().sorted().skip(k-1).findFirst();
		System.out.println(l1);
	}

}
