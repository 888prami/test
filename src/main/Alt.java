package main;
public class Final{
	public static void main(String args[]){
		final StringBuilder sb= new StringBuilder("Geeks");
		System.out.println(sb);
		//Non transitivity property
		sb.append("For Geeks");
		System.out.println(sb);
		}
}