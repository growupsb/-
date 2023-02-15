package inheritance_ex_11_0213;

import java.util.InputMismatchException;
import util.DataType;

public class DataManager {
	//속성 : Person을 배열로 선언(20개)
	private Person [] p = new Person[30];
	//count : 배열의 인덱스 사용될 변수
	private int count;
	
	public Person[] getPerson() {
		return p;
	}
	public int getCount() {
		return count;
	}
	
	public void register() throws MenuChoiceException { // case 1번 "등록" 요소
		outer:
		while(true) {
			int no = 0;
			Menu.subMenu();
			try { // 문자 입력 방지
			no=DataType.inputInt();
			}catch(InputMismatchException e) {
				System.out.println("메뉴 번호는 숫자만 입력하세요");
				return; 
			}
			if(no<1||no>4) throw new MenuChoiceException(no);
			switch(no) {
			case 1: // 학생
				Student st = new Student();
				st.inputInfo();
				addPerson(st);//입력한 자료를 저장함.
				break;
			case 2: //교사
				Teacher t = new Teacher();
				t.inputInfo();
				addPerson(t);
				break;
			case 3: //직원
				Employee ep = new Employee();
				ep.inputInfo();
				addPerson(ep);
				break;
			case 4:
				break outer; // 레이블 지정된 반복문 이탈
			//default:
				//System.out.println("지원되지 않는 메뉴 번호입니다.");
				//break;
			}
		}
	}
	
	private void addPerson(Person person) {
		if(count<p.length)
			p[count++] = person;
		else
			System.out.println("정원이 30명 초과되었습니다.");	
	}
	public void printAll() {
		//객체별로 출력한다 : 학생, 교사, 직원 구분하여 출력. instanceof 사용
		String str="";
		for(int i=0;i<count;i++) {
			if(p[i] instanceof Student) {
				str += "\n-----학생정보-----\n";
			}else if(p[i] instanceof Teacher) {
				str += "\n-----교사정보-----\n";
			}else {
				str += "\n-----직원정보-----\n";
			}
			str+=p[i].getInfo(); //st.getInfo(), t.getInfo(), ep.getInfo()가 p 안에 다 들어감
		}
		System.out.println(str);
	}
	
	public void findPerson(String name) {
		for(int i=0;i<count;i++) {
			String pName = p[i].getName();
			if(name.equals(pName))
				p[i].printAll();
		}
		System.out.println(name + "이란 사람은 없습니다.");
	}
	
	public void remove(String name) {
		for(int i=0;i<count;i++) {
			String pName = p[i].getName();
			if(name.equals(pName)) {
				for(int j=i;j<count;j++) {
					p[j]=p[j+1];
				}
				count--;
				System.out.println(name + "님의 정보가 삭제되었습니다.");
			}
		}
		System.out.println(name + "님은 없습니다.");
	}
}
