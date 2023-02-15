package inheritance_ex_11_0213;

import util.DataType;

public class Teacher extends Person {
		private String id;
		private String subject;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		//교사 정보 입력
		public void inputInfo() {
			System.out.print("교번을 입력하세요 : ");
			String i = DataType.inputString();
			setId(i);
			System.out.print("담당과목을 입력하세요 : ");
			String s = DataType.inputString();
			setSubject(s);
			super.inputInfo();
		}
		public String getinfo() {
			String info = "교번 : " + id + "\n담당과목 : " + subject + super.getInfo();
			return info;
		}
		public void printAll() {
			System.out.println(this.getInfo()); 
		}
	}