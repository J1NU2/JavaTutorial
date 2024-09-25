package _09_리스트;

import java.util.ArrayList;

public class ListSample {
	ArrayList<String> a = new ArrayList<>();
	
	// 생성자
	ListSample() {
		System.out.println("리스트의 길이 : " + a.size());
		a.add("Apple");		// index 0
		System.out.println("리스트의 길이 : " + a.size());
		a.add("Banana");	// index 1
		a.add("Asparagus");	// index 2
		a.add("Blueberry");	// index 3
		System.out.println("리스트의 길이 : " + a.size());
		System.out.println(a.get(1));
		
		// 배열의 모든 문자열 확인
		System.out.println(a);
		// 또는
		for (int i=0; i<a.size(); i++) {
			System.out.println(i + " : " + a.get(i));
		}
		System.out.println();
		// 첫 글자가 A인 문자열은 제외하고 출력
		for (int i=0; i<a.size(); i++) {
			if (a.get(i).charAt(0) != 'A') {
				System.out.println(i + " : " + a.get(i));
			}
		}
		System.out.println();
		// 인덱스 중간에 값 추가
		a.add(2, "Berry");
		for (int i=0; i<a.size(); i++) {
			System.out.println(i + " : " + a.get(i));
		}
		System.out.println();
		// 특정 인덱스에 있는 값 삭제
		a.remove(2);
		for (int i=0; i<a.size(); i++) {
			System.out.println(i + " : " + a.get(i));
		}
		System.out.println();
		// 특정 인덱스의 값 변경
		a.set(3, "Berry");
		for (int i=0; i<a.size(); i++) {
			System.out.println(i + " : " + a.get(i));
		}
		System.out.println();
		System.out.println("리스트의 길이 : " + a.size());
		a.clear();		// 리스트 전체 삭제
		System.out.println("리스트의 길이 : " + a.size());
		
	}
}
