package thread_0221;

import java.io.File;

public class Thread_01 {
	public static void main(String[] args) throws InterruptedException {
		File file = new File("C:/java/work");
		if(file.exists())
			file.delete();
		Thread.sleep(3000); //3초동안 잠시 멈춤 => 실행 시 출력문이 바로 나타나지 않고 3초 후 출력
		System.out.println("Thread 사용");
		if(!file.exists())
			file.mkdir(); //파일이 존재하지 않으면 파일 생성
	}
}
