package io.file_0221;

import java.io.File;
import java.io.IOException;

public class FilesEx_03 {
	public static void main(String[] args) throws InterruptedException {
		File file = new File("C:/java/work");
		if(!file.exists()) {
			file.mkdir();
		Thread.sleep(3000);
		
		File f1 = new File(file,"test.txt");
		if(!f1.exists())
			try {
				f1.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		if(f1.canWrite())
			f1.setReadOnly(); //읽기 전용
		}
	}
}
