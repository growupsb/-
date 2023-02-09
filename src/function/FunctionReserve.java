package function;

public class FunctionReserve {
	public static void main(String[] args) {
		System.out.println(reverse(12345));
	}

	private static int reverse(int num) {
		int	result = 0;
		for(;num != 0;num/=10) {// int num 값이 밖에 있기 때문에 앞에 세미콜론(;)을 붙임			
			int rem = num%10;
		result = result*10+rem;		
		}
		return result;
	}
}
