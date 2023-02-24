package lamda;

interface Printable{
	void print(String s);
}
class Printer implements Printable{

	@Override
	public void print(String s) {
		System.out.println(s);
	}
}
public class LamdaEx1 {
	public static void main(String[] args) {
		Printer prn=new Printer();
		prn.print("Lamda");
	}
}
