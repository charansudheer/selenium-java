package testBook.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectons {

/*	public static void main(String[] args) {
		Collection<Integer> values=new ArrayList<>();
		values.add(5);
		values.add(8);
		//values.add("sudheer");
		System.out.println(values);*/

	
	/*	public static void main(String[] args) {
		Collection<String> values=new ArrayList<>();
	//	values.add(5);
		//values.add(8);
		values.add("okay");//used retrive values
		Iterator itr=values.iterator();//declareing iterator interface
		//values.add("sudheer");
		while(itr.hasNext()) {//which is used escape from noSuch value exception
			System.out.println(itr.next());*///printed itrator values using NEXT command
	
	
	
	/*public static void main(String[] args) {
		List<Integer> values=new ArrayList<>();
		values.add(5);
		values.add(8);
		//values.add("25k");//list takes any object
		values.add(1, 22);//inserting value in index number
		for(Object o:values)//for(int i=0;i<values.size();i++)
		{
		//System.out.println(values.get(i));//values to be printed using values.get		
		System.out.println(o);//enhanced for loop*/

	
	public static void main(String[] args) {
	List<Integer> values=new ArrayList<>();
	values.add(5);
	values.add(8);
	values.add(2);
	values.add(7);
	Collections.sort(values);
	Collections.reverse(values);
	Collections.shuffle(values);
	for(Object o:values)//for(int i=0;i<values.size();i++)
	{
	//System.out.println(values.get(i));//values to be printed using values.get		
	System.out.println(o);
		
}}}


