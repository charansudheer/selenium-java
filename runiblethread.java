/*used run the thread by interface method ruiable by "implements ruinible"
 both classes run at time by createing multi threads*/
package testBook.java;
class tou implements Runnable{//is method for implements new threads in interface
	public void run() {
		for(int i=0;i<5;i++) {
			
	System.out.println("HELLO");try{Thread.sleep(1000);}catch(Exception e){}}
	//craeteing dealy in theads disply 5sec by sleep along with exception
}}
class hey implements Runnable{//2 nd class and method
	public void run() {for(int i=0;i<5;i++) {
		System.out.println("JARUGU");try{Thread.sleep(1000);}catch(Exception e){}}
}//craeteing dealy in theads disply 5sec by sleep along with exception

public static class runiblethread {

public static void main(String[] args) {
	Runnable obj= new tou();// create object for tou with reference interface
	Runnable obj1= new hey();// create object for hey with reference interface
	Thread t1= new Thread(obj);/*for excicution of thread objects run, sleep etc */
//createing object for class thred t1 & assining obj is varible for contructor 
	Thread t2= new Thread(obj1);
//createing object for class thred & assining obj is varible for contructor
	t1.start();// createing new thread t1 by using start command
	try{Thread.sleep(10);}catch(Exception e){};//delay created b/w threads set t1t2
	t2.start();//createing new thread t1 by using start command
}
		
	}
}