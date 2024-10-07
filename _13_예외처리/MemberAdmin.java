package _13_예외처리;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MemberAdmin {
	// 멤버변수
	
	// 객체
	MemberOne[] m = new MemberOne[5];
	
	MemberAdmin() throws Exception {
		/*
		System.out.println(m[0]);		// null
		System.out.println(m[1]);		// null
		System.out.println(m[2].getId());	// 에러 발생, NullPointerException
		System.out.println("End");
		*/
		test1();	// 예외처리를 해줘야 하는 경우, 직접처리 방식 사용
		test2();	// 예외처리를 안해줘도 되지만 try구문을 사용한 경우
		test3();	// 예외처리를 해줘야 하는 경우, 예외 떠넘기기 사용
	}
	
	// test1메서드의 예제의 예외처리는 반드시 해줘야 한다.
	// 예외처리 방법은 직접 처리하기 위해 try-catch-finally구문을 사용하였다.
	private void test1() {
		File file = new File("Output.txt");
		FileWriter writer;
		// 직접 예외를 처리하는 구문 : try-catch구문
		try {
			// try블록에서는 예외가 발생할 코드를 작성한다.
			// 예외가 발생하면 더 이상 코드를 실행하지 않고 catch블록으로 이동한다.
			writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
		} catch (Exception e) {
			// catch블록에서는 try블록에서 예외가 발생했을 때 처리를 해주는 블록이다.
			e.printStackTrace();
		} finally {
			// finally블록은 try 구문을 빠져 나갈 때 실행되는 블록이다.
			// 예외 발생 여부와 상관 없이 실행된다.
		}
	}
	// test2메서드의 예제의 예외처리는 굳이 필요하지 않다.
	// 하지만 예외처리를 방식을 이해하기 위해 try-catch-finally구문을 사용하였다.
	private void test2() {
		MemberOne[] mm = new MemberOne[5];
		try {
			System.out.println("1");
			System.out.println(mm[0]);
			System.out.println("2");			// 콘솔 출력 시
//			System.out.println(mm[1].getId());	// 1 → null → 2 → catch블록, 예외발생 → finally블록
			// 왜 에러가 발생하는가?
			// 참조하려는 객체의 주속 null이기 때문에 NullPointerException 에러가 발생한다.
			System.out.println(mm[1]);			// 1 → null → 2 → null → 정상종료 → finally블록
			System.out.println("정상종료");
		} catch (Exception e) {
			System.out.println("catch블록, 예외발생");
		} finally {
			System.out.println("finally블록");
		}
	}
	// test3메서드의 예제의 예외처리는 반드시 해줘야 한다.
	// 예외처리 방법은 호출(call)한 위치에서 처리하기 위해 떠넘기기 방식을 사용하였다. (throws Exception)
	private void test3() throws Exception {
		File file = new File("Output.txt");
		FileWriter writer;
		writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}
}
