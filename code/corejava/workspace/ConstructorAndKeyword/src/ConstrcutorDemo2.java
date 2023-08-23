public class ConstrcutorDemo2 {
	public static void main(String[] args) {
		SendGift giftMobile = new SendGift("Abc", "987665757", "Flat No 23");
	}
}

class SendGift {
	private String name;
	private String contact;
	private String address;
	
	public SendGift(String n, String c, String a) {
		name = n;
		contact = c;
		address = a;
	}
	
	public SendGift(String n, String a) {
		name = n;
		address = a;
	}
	
	/*
	 * public void setName(String name) { this.name = name; } public void
	 * setAddress(String address) { this.address = address; } public void
	 * setContact(String contact) { this.contact = contact; }
	 */
	
	public String getAddress() {
		return address;
	}
	public String getContact() {
		return contact;
	}
	public String getName() {
		return name;
	}
}
