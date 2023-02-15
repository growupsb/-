//package exception_ex;
//
//public class InvalidExceptionMain {
//
//	public static void main(String[] args) {
//		
//		int result = 0;
//		try {
//			result = subtract(5,100);
//		}catch (InvalidException e) {
//			System.out.println(e.getMessage);
//		}
//	}
//
//	private static int subtract(int i, int j) throws InvalidException {
//		if(i<j)
//			//System.out.println("잘못된 입력값");
//			throw new InvalidException();
//		return i-j;
//	}
//
//}
