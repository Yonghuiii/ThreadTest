
public class ThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread thread1 = new thread_test();
		thread1.setName("Thread #1");
		Thread thread2 = new thread_test();
		thread2.setName("Thread #2");
		
		Runnable runnable1 = new interface_test();
		Runnable runnable2 = new interface_test();
		
		Thread thread3 = new Thread(runnable1);
		thread3.setName("Thread #3");
		Thread thread4 = new Thread(runnable2);
		thread3.setName("Thread #4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
		
		//람다 구문 이용
		/*
		//Thread 생성자의 인자로 람다를 넘기면 됨
		
		Thread thread = new Thread(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName);
		});
		thread.setName("Thread #1");
		thread.start();
	}*/

	}
}
