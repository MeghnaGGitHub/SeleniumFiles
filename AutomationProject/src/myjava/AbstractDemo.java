package myjava;

 abstract class  Car{
	public abstract void Carname();
	public abstract void mileage();
	public abstract void cost();
	public abstract void manufacturer();
}
 class Swift extends Car{
	public void Carname() {
		System.out.println("Car name:Swift");
	}
	public void mileage() {
		System.out.println("Car mileage :200 kmph");
	}
	public void cost() {
		System.out.println("Car cost :8.5 Lakhs");
	}
	public void manufacturer() {
		System.out.println("Manufacturer :Maruti");
	}
}
 class Venue extends Car{
	 public void Carname() {
			System.out.println("Car name:Venue");
		}
		public void mileage() {
			System.out.println("Car mileage :150 kmph");
		}
		public void cost() {
			System.out.println("Car cost :6.5 Lakhs");
		}
		public void manufacturer() {
			System.out.println("Manufacturer :Hyundayi");
		}
 }
public class AbstractDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Venue();
		obj.Carname();
		obj.mileage();
		obj.cost();
		obj.manufacturer();

	}

}
