package week1.day1;

public class Mobile {
	public void sendmessage() {
		String Name = "Have a great Day";
		System.out.println(Name);
	}

	public void makecall() {
		Long number = 1234567890L;
		System.out.println(number);
	}

	public void savecontact() {
		String Name1 = "Save all the contact details";
		System.out.println(Name1);
	}

	public static void main(String[] args) {
		Mobile phone = new Mobile();
		phone.sendmessage();
		phone.makecall();
		phone.savecontact();
	}
}
