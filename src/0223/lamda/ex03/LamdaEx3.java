package lamda.ex03;

interface Printable{
	void print(String s);
}

public class LamdaEx3 {
	public static void main(String[] args) {
		Printable prn=(s) -> {System.out.println(s);};
		prn.print("Lamda3.....");
	}
}
