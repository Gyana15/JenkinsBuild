package MultiThreading;

public class Synchronization{
	static int count=0;
	public static void runThread(){
		count++;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Thread t1 = new Thread(()->{for(int i=0;i<5;i++) runThread();});
Thread t2 = new Thread(()->{for(int i=0;i<5;i++) runThread();});
System.out.println(count);
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println(count);

	}

}