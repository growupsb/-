package io.file_0221;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx_01 {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		
		if(dir.exists()==false) dir.mkdir(); // images 파일 생성
		if(file1.exists()==false) {
			file1.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		}
		else {
			file1.delete(); // file1이 있으면 삭제됨
			System.out.println("파일이 삭제되었습니다.");
		}
		if(file2.exists()==false) file2.createNewFile();
		
		//Temp 폴더 내용 출력
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		for(File file : contents) { // 배열은 무조건 반복문. 향상된 for문 사용
			System.out.printf("%-25s",sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) //파일이 디렉토리인가?
				System.out.printf("%-10s%-20s","<DIR>",file.getName());
			else
				System.out.printf("%-10s%-20s",file.length(),file.getName());
			System.out.println();
		} 
	}
}
