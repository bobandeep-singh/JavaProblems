package com.boban.multithreading;

public class ExampleOne {

	public static void main(String [] args){
		MyProcess myProcess = new MyProcess("Hello Kavish");
		//MyProcess myProcess1 = new MyProcess("Hello Kavish1");
		MyThread myThread1 = new MyThread(myProcess,"Kavish1");
		//MyThread myThread2 = new MyThread(myProcess,"Kavish2");
		//MyThread1 myThread3 = new MyThread1(myProcess,"Garg3");
		//MyThread1 myThread4 = new MyThread1(myProcess,"Garg4");
		//MyThread1 myThread4 = new MyThread1(myProcess1,"Garg4");
		//MyThread2 myThread5 = new MyThread2(myProcess1,"Garg5");
		//MyThread2 myThread6 = new MyThread2(myProcess1,"Garg6");
		MyThread2 myThread7 = new MyThread2(myProcess,"Garg7");
		//MyThread2 myThread8 = new MyThread2(myProcess1,"Garg8");
		myThread1.start();
		//myThread2.start();
		//myThread3.start();
		//myThread4.start();
		//myThread5.start();
		//myThread6.start();
		myThread7.start();
		//myThread8.start();
	}

}


/*we have synchronization between only 2 same level locks
like if we have class level lock that means synchronization work if another 
thread also have class level lock.*/
class MyProcess{
	public String processName;

	MyProcess(String processName){
		this.processName=processName;
	}

	public void display(String testt){
		String test=testt;
		for(int i=0;i<=10;i++)
			System.out.println("++++++++++"+processName+"------"+Thread.currentThread().getName()+"****"+test);
	}
	public synchronized void display1(String testt){
		String test=testt;
		for(int i=0;i<=10;i++)
			System.out.println("1++++++++++"+processName+"------"+Thread.currentThread().getName()+"****"+test);
	}
	public static synchronized void display2(String testt){
		String test=testt;
		for(int i=0;i<=10;i++)
			System.out.println("2+++++++++------"+Thread.currentThread().getName()+"****"+test);
	}
}

class MyThread extends Thread{
	MyProcess myProcess;
	String test;

	MyThread(MyProcess myProcess,String test) {
		this.myProcess=myProcess;
		this.test=test;
	}

	public void run(){
		myProcess.display(test);

	}
}

class MyThread1 extends Thread{
	MyProcess myProcess;
	String test;

	MyThread1(MyProcess myProcess,String test) {
		this.myProcess=myProcess;
		this.test=test;
	}

	public void run(){

		myProcess.display1(test);
	}
}

class MyThread2 extends Thread{
	MyProcess myProcess;
	String test;

	MyThread2(MyProcess myProcess,String test) {
		this.myProcess=myProcess;
		this.test=test;
	}

	public void run(){

		myProcess.display2(test);
	}
}

