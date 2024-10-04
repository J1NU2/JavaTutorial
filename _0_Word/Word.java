package _0_Word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Word {
	// 파일 객체 초기화
	File file = null;
	
	// 입력 객체
	Scanner in = new Scanner(System.in);
	
	// 생성자
	Word() {
		if (file == null) {
			// 파일 객체 생성
			file = new File("Output.txt");
//			file = new File("D:/Output.txt");		// 경로로 설정하기
		}
		menu();
	}
	
	// 메뉴
	private void menu() {
		while (true) {
			String selNum = null;
			
			System.out.println("◆ 단어장 ◆");
			System.out.println("0.프로그램 종료");
			System.out.println("1.영어단어 저장");
			System.out.println("2.영어단어장 검색");
			System.out.println("3.영어단어장 삭제");
			
			System.out.print("▷ 번호 선택 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n영어단어를 등록합니다.");
				add();
			} else if (selNum.equals("2")) {
				search();
			} else if (selNum.equals("3")) {
				delete();
			} else {
				System.out.println("\n잘못된 입력 방식입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 영어단어 저장
	private void add() {
		System.out.println("▷ 등록할 영어 단어를 입력해주세요.");
		System.out.print("▷ 단어 : ");
		String word = in.nextLine();
		System.out.println();
		try {
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter buffWriter = new BufferedWriter(writer);
//			BufferedWriter buffWriter = new BufferedWriter(new OutputStreamWriter(System.out));
			buffWriter.write(word);	// 출력
			buffWriter.newLine();	// 줄 바꿈
			buffWriter.flush();		// 남아있는 데이터를 모두 출력
			buffWriter.close();		// 스트림 닫기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 영어단어장 검색
	private void search() {
		try {
			// 입력 스트림 생성
			FileReader reader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(reader);
//			BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("\n◇ 등록된 영어단어 ◇");
			while (true) {
				String wordLine = buffReader.readLine();
				if (wordLine == null) break;
				System.out.println("◇ " + wordLine);
			}
			System.out.println();
			// 버퍼 스트림 닫기
			buffReader.close();
		} catch (Exception e) {
			System.out.println("\n▲ 단어가 존재하지 않습니다.\n");
//			e.printStackTrace();
		}
	}
	// 영어단어장 삭제
	private void delete() {
		if (file.delete()) {
			System.out.println("\n△ 단어장을 삭제했습니다.\n");
		} else {
			System.out.println("\n▲ 단어장이 존재하지 않습니다.\n");
		}
	}
}
