class Increment {
	int num = 0;
	public void increment() { num++; }	//	getter() 생성
	public int getNum() { return num; }
}

class IncThread extends Thread {
	Increment inc;
	public IncThread(Increment inc) { this.inc = inc; }
	public void run() {
		for (int i = 0 ; i < 10000 ; i ++ ) {
			for (int j = 0 ; j < 10000 ; j++ ) {
				inc.increment();
			}
		}
	}
}

class ThreadSyncError {
	public static void main(String[] args) {
		Increment inc = new Increment();
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);

		it1.start();	it2.start();	it3.start();
		try {
			it1.join();	it2.join();	it3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(inc.getNum());		//	결과가 3억이 나와야 하지만 훨씬 작은 값이 나오게 됨(약 1억)
	}											//	it1, it2, it3가 num변수를 공유하면서 각각 증가시킬 때 서로 변수의 값을 가져가는 상황이 발생하여
}												//	증가 후 덮어쓰기가 돼버림
