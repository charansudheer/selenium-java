package testBook.java;
	public  class threadLambdaEpession {
    public static void main(String[] args)throws Exception {
		// create object for tou with reference interface
		
		Thread t1= new Thread(()-> {for(int i=0;i<5;i++) {
			System.out.println("JARUGU   "+Thread.currentThread().getPriority());try{Thread.sleep(1000);}catch(Exception e){}}},"charan");
		Thread t2= new Thread(() ->{
			for(int i=0;i<5;i++) {
		System.out.println("HELLO   "+Thread.currentThread().getPriority());try{Thread.sleep(1000);}catch(Exception e){}}},"sudheer");
		//t1.setName("Charan");
		//t2.setName("sudheer");
		//System.out.println(t1.getName());
		//System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){};
		t2.start();
/*befor joining main method thred is active after join it will be in active by "isAlive()"*/
		System.out.println(t2.isAlive());
		t1.join();
		t2.join();
		System.out.println(t2.isAlive());
/*it is link with main thred will be printed only after adding join "t.thred" */
		System.out.println("arey bhai thank u");
	}
			
		}
	