package lamda.ex04;

interface Printable{
	void print(String s);
}

public class LamdaEx4 {
	public static void display(Printable p,String str) {
		p.print(str);
	}
	public static void main(String[] args) {
		display((s) -> {System.out.println(s);},"Lamda4...");
	}
}
