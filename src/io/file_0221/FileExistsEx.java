package io.file_0221;

import java.io.File;

public class FileExistsEx {
	public static void main(String[] args) throws InterruptedException {
		File file = new File("C:/java/work");
		if(file.exists()) { //파일 존재 시 파일 삭제
			file.delete();
			System.out.println("디렉토리가 삭제되었습니다.");
		}else
			System.out.println("디렉토리를 생성하세요.");
		
		if(! file.exists()) {
			file.mkdir(); //mkdir은 상위 폴더가 미리 생성된 상태여야 하고 mkdirs는 상위+하위 폴더 동시 생성됨
			System.out.println("디렉토리가 생성되었습니다.");
		}

	}
}
