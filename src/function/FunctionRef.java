package function;

public class FunctionRef {
	public void increase(int[] n) {
		for(int i=0;i<n.length;i++)
			n[i]++;
	}
	public static void main(String[] args) {
		int[] ref1 = {100,200,300};
		FunctionRef fr = new FunctionRef();
		System.out.println("호출 전");
		for(int i = 0;i<ref1.length;i++)
			System.out.println("ref1["+i+"]="+ref1[i]);
		
		fr.increase(ref1);
		
		System.out.println("호출 후");
		for(int i = 0;i<ref1.length;i++)
			System.out.println("ref1["+i+"]="+ref1[i]);
	}
}
