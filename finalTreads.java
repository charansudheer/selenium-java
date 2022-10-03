
/*used to call thread class by extends implemening multi thraeds */
package testBook.java;
class hi extends Thread{
	public void run() {//is run method available in thread class mostly used
		for(int i=0;i<5;i++) {
	System.out.println("HELLO");try{Thread.sleep(1000);}catch(Exception e){}}
	
}}
class hello extends Thread{
	public void run() {for(int i=0;i<5;i++) {
		System.out.println("JARUGU");try{Thread.sleep(1000);}catch(Exception e){}}
}
}
	
public class finalTreads {

public static void main(String[] args) {
	hi obj= new hi();
	hello obj1= new hello();
	obj.start();
	try{Thread.sleep(10);}catch(Exception e){};
	obj1.start();
}}

