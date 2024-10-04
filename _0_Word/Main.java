package _0_Word;

// 클래스
// BufferedReader : 버퍼를 이용한 데이터의 입력
// BufferedWriter : 버퍼를 이용한 데이터의 출력
// File : 파일이나 폴더에 대한 기능 제공
// FileReader : 문자 기반 스트림, 텍스트 파일을 프로그램으로 읽을 때 사용, 텍스트만 읽어올 수 있다.
// FileWriter : 문자 기반 스트림, 텍스트 데이터를 파일에 저장할 때 사용, 텍스트만 저장할 수 있다.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

// 영어단어를 저장하고 검색하는 프로그램
// 단, 단어는 text파일로 저장
public class Main {
	public static void main(String[] args) {
		new Word();
		
		/*
		// .write() : 출력
		// .flush() : 남아있는 데이터를 모두 출력
		// .close() : 스트림 닫기
		
		// 경로에 있는 File객체의 파일에 내용 덮어쓰기
		try {
//			File file = new File("Output.txt");
			File file = new File("D:\\data\\J1NU2\\JavaTu2\\src\\_0_Word\\Output.txt");
//			FileWriter writer = new FileWriter(file);
//			BufferedWriter bufferedWriter = new BufferedWriter(writer);
//			bufferedWriter.write(" i love you \n i like you");
//			bufferedWriter.write(" my test");
//			bufferedWriter.flush();
//			bufferedWriter.close();
		} catch (Exception e) {
            e.getStackTrace();
		}
		
		// 경로에 있는 File객체의 파일에 내용 추가하기
		try {
//			File file = new File("Output.txt");
			File file = new File("D:\\data\\J1NU2\\JavaTu2\\src\\_0_Word\\Output.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(" human");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
//			e.getStackTrace();
		}
		
		// 경로에 지정된 File객체의 파일 내용 읽어오기
		try {
	        // 파일 객체 생성
//	        File file = new File("Output.txt");
	        File file = new File("D:\\data\\J1NU2\\JavaTu2\\src\\_0_Word\\Output.txt");
	        // 입력 스트림 생성
	        FileReader file_reader = new FileReader(file);
	        BufferedReader bufferedReader = new BufferedReader(file_reader);
	        
	 		while (true) {
	 			String line = bufferedReader.readLine();
	 			if (line == null) break;
	 			System.out.println(line);
	 		}
	 		bufferedReader.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		*/
	}

}