package progetti.car;

public class CarTester {

	public static void main(String[] args) {
		Car panda=new Car(20);
		panda.addGas(20);
		panda.drive(100);
		System.out.println(panda.getGas());
		panda.drive(100);
		System.out.println();
	}
}


