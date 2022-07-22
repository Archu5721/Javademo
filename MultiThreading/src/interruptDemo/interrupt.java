package interruptDemo;

public class interrupt implements Runnable {
	
	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(tname+ ": Interrupted");
				break;
			}
			System.out.println(tname + ":" +i);
		}
	}

}
