package testBook.java;
class counter{
	int count;//declareing variable
	public synchronized void incriment() {
		count++;//incrimenting count 
	}
}
public class SYNCRONIZE {
//syncronized command is used for excecute thread in alternating manner not distrubing other
	public static  void main(String[] args)throws Exception  {
		 counter c= new counter();//createing object for class
/*creating thred for t and Runnable object for making lambda expression*/
		Thread t=new Thread(new Runnable() { 
			 public void run() {//defineing runnable method run
			 for(int i=1;i<=1000;i++) {//loop incriment for calling incriment
		c.incriment();
		 }}});
/*creating thred for t1 and Runnable object for making lambda expression*/
		Thread t1=new Thread(new Runnable() {
			 public void run() {
			 for(int i=1;i<=1000;i++) {
		c.incriment();
		 }}});

	t.start();// starting of thread t
	t1.start();// starting of thread t1
	
	t.join();//to make main thread to wait for join after excicuteing t
	t1.join();//to make main thread to wait for join after excicuteing t1
	System.out.println(c.count);//displays total count of thred t&t1.  
	}

}
