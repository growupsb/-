package io.file_0221;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileEx_04 {
	public static void main(String[] args) throws IOException {
		/*File file = new File("C:/java/work2");
		boolean bool = file.mkdir();
		if(bool) 
			System.out.println("디렉토리가 생성되었습니다.");
		else
			System.out.println("생성에 실패하였습니다.");*/
		File file = new File("C:/java/work/abc.txt");
		if(file.exists()) {
			file.deleteOnExit(); // 2. 프로그램 종료 시 삭제됨
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일경로 : " + file.getPath()); //경로
			System.out.println("파일경로 : " + file.getParent());
			System.out.println("파일크기 : " + file.length() + "kb");
			System.out.println("최종 수정일 : " + new Date(file.lastModified()));
		}else
			System.out.println(file.getName() + "라는 파일이 없습니다.");
			file.createNewFile(); // 1. 파일이 없으므로 생성해줌
	}
}
