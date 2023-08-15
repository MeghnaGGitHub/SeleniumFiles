package myjava;

public class DecisionMakingExample {
	public void ifExample(int i) {
		System.out.println("i="+i);
		if(i%2==0) {
			System.out.println("Even Number!");
		}
		System.out.println("done");
	}
	public void ifElseExample(int i) {
		System.out.println("i="+i);
		if(i%2==0) {
			System.out.println("Even Number!");
		}
		else {
			System.out.println("Odd number!!");
		}
		System.out.println("done");
	}
	public void nestedIfElseExample(int i) {
		System.out.println("i ="+ i);
		if (i==0) {
			if (i%2==0) {
				System.out.println("Even Number!");
			}
			else {
				System.out.println("Odd Number!");
			}
		}
	}
	public void elseIfExample(int i) {
		System.out.println("i="+i);
		if (i<0) 
			System.out.println("Negative number");
		else if (i>0) 
			System.out.println("Positive number");
		else if(i==0)
			System.out.println("Nor negative nor positive");
	}
	public void switchCaseExample(String day) {
		switch (day) {
		case "Mon": 
			System.out.println("It's Monday today!!");
			break;
		case "Tues":
			System.out.println("It's Tuesday today!");
			break;
		case "Wed":
			System.out.println("It's Wednesday today!");
			break;
		case "Thurs":
			System.out.println("It's Thursday today!");
			break;
		case "Fri":
			System.out.println("It's Friday today!");
			break;
		case "Sat":
			System.out.println("It's Saturday today!");
			break;
		case "Sun":
			System.out.println("It's Sunday today!");
			break;
		default:
			System.out.println("Plz provide a valid day-----");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionMakingExample obj=new DecisionMakingExample();
		//obj.ifExample(23);
		//obj.nestedIfElseExample(22);
		obj.switchCaseExample("Sat");
	}

}
