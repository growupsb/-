package interfaceex_0215;

public class SmartTVMain {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTV();
		rc.turnOn();
		rc.turnOff();
		Searchable search = new SmartTV();
		search.search("https://qqqqqqq");
		
		SmartTV st = new SmartTV();
		st.turnOn();
		st.turnOff();
		st.search("늉늉");
	}
}
