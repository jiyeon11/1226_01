package info.controller;

import info.view.StudentView;
import info.vo.StudentDAO;
import info.vo.StudentVO;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoController {
	public static final int CONTINUE  = 1;
	public static final int EXIT = 0;
	
	ArrayList<StudentVO> svoList;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int flag = CONTINUE;
		
		ArrayList<Integer> grade = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> phoneNum = new ArrayList<String>();
		ArrayList<String> address = new ArrayList<String>();
		ArrayList<String> major = new ArrayList<String>();
		
		do {  //입력
			System.out.print("이름을 입력해주세요 : ");
			name.add(sc.nextLine());
			System.out.print("학번을 입력해주세요 : ");
			id.add(scan.nextInt());
			System.out.print("학년을 입력해주세요 : ");
			grade.add(scan.nextInt());
			System.out.print("학과를 입력해주세요 : ");
			major.add(sc.nextLine());
			System.out.print("주소를 입력해주세요 : ");
			address.add(sc.nextLine());
			System.out.print("전화번호를 입력해주세요 : ");
			phoneNum.add(sc.nextLine());
			System.out.print("\n계속 입력하시겠습니까?(종료 0 | 계속 1) : ");
			flag = scan.nextInt();
			System.out.println("=====================================");
		}while(flag == 1);
		
		StudentInfoController controller = new StudentInfoController();
		StudentDAO dao = new StudentDAO();
		
		
		for(int i = 0; i< name.size(); i++) {  //svo에다가 arrayList들 값 넣음
			StudentVO svo = new StudentVO(name.get(i),id.get(i),grade.get(i),major.get(i),address.get(i),phoneNum.get(i));
			dao.insert(svo);
		}
		
		StudentView stuView = new StudentView();
		stuView.view(dao.select());
		
		//스캐너 닫아줌
		sc.close();
		scan.close();
	}
}
