package phoneNumber;

public class PhoneVO {
	private String name;
	private String phoneNumber;
	private String birth;
	
	public PhoneVO(String name, String phoneNumber, String birth) {
		super();
		setName(name);//this.name = name;
		setPhoneNumber(phoneNumber);//this.phoneNumber = phoneNumber;
		setBirth(birth);//this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "전화번호 정보: [name=" + name + ", phoneNumber=" + phoneNumber + ", birth=" + birth + "]";
	}
	public void display() {
		System.out.println("name=" + name );
		System.out.println("phoneNumber=" + name );
		System.out.println("birth=" + birth );
		
	}
}
