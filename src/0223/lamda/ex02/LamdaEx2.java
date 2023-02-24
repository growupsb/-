package lamda.ex02;

interface Printable{
	void print(String s);
}

public class LamdaEx2 {
	public static void main(String[] args) {
		Printable prn=new Printable() {
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		prn.print("Lamda2...");
	}
}
