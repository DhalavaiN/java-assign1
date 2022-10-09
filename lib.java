package manlib;
import java.util.*;
public class lib {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] book=new String[100];
		String[] author=new String[100];
		int[] no=new int[100];
		System.out.println("enter the no of books to add=");
		int size=s.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("enter the bookname=");
			book[i]=s.next();
			System.out.println("enter the bookno=");
			no[i]=s.nextInt();
			System.out.println("enter the author name=");
			author[i]=s.next();
			}
		System.out.println("\tBookname\tauthor");
		System.out.println("-------------------");
		for(int i=0;i<size;i++) {
		System.out.println("|\t"+book[i]+"|\t"+author[i]+"\t");}
	}

}
