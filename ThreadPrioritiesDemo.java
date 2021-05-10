class ThreadPrioritiesDemo{
	public static void main(String[] args) {
		Task theTask = new Task();
		Thread first = new Thread(theTask);
		Thread second = new Thread(theTask);
		Thread third = new Thread(theTask);

		first.setName("Saumya");
		second.setName("Prashant");
		third.setName("Raj");

		// Constants defined in the Thread class: MIN_PRIORITY, MAX_PRIORITY, NORM_PRIORITY

		first.setPriority(Thread.MIN_PRIORITY);
		second.setPriority(Thread.NORM_PRIORITY);
		third.setPriority(Thread.MAX_PRIORITY);

		// System.out.println("First's Priority :" + first.getPriority());

		first.start();
		second.start();
		third.start();
	}
}

class Task implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
