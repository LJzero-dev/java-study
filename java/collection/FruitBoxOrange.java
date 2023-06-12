class Orange {
	int sugar;
	public Orange(int s) { sugar = s; }
	public void showSugar() { System.out.println("당도 : " + sugar); }
}

class OrangeBox{
	Orange item;
	public void store(Orange item) { this.item = item; }
	public Orange pullOut() { return item; }
}

class FruitBoxOrange {
	public static void main(String[] args) {
		OrangeBox box1 = new OrangeBox();
		box1.store(new Orange(10));
		Orange org1 = box1.pullOut();
		org1.showSugar();

		OrangeBox box2 = new OrangeBox();
		box2.store("오렌지");
		Orange org2 = box2.pullOut();
		org2.showSugar();
		
	}
}

/*
문제점
 - OrangeBox에 오직 Orange만 저장되게 됨
 - 다른 종류의 과일 인스턴스를 저장하려면 각 과일별로 ~BOx 클래스가 존재해야 함

 해결책 : FruitBoxGeneric.java
 - 제네릭을 이용하여 저장될 클래스의 종류를 지정함
*/