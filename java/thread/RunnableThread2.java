class SumThread extends Thread {
	int num, start, end;

	public SumThread(int s, int e) {
		num = 0;	start = s;	end = e;
	}

	public void addNum(int n) { num += n; }
	public int getNum() { return num; }

	
	public void run() {
		for (int i = start; i <= end ; i++ ) {
			addNum(i);
		}
	}
}

class RunnableThread2 {
	public static void main(String[] args) {
		SumThread st1 = new SumThread(1, 50);
		SumThread st2 = new SumThread(51, 100);
		st1.start();		st2.start();

		try {
			st1.join();	st2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("1~100 까지의 합 : " + (st1.getNum() + st2.getNum()));
	}
}
