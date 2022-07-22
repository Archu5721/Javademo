package execFramework;

public class Worker implements Runnable{
	String source;
	Worker(String source){
		this.source=source;
	}
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + " " + source +": Starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tname + " " + source +": Ends" );
		
	}

}
