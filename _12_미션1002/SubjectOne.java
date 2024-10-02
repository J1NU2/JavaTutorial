package _12_미션1002;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectOne {
	// 교과목의 정보
	String sbName = null;	// 과목명
	String sbClass = null;	// 강의실
	String sbProfe = null;	// 담당교수
	
	// 생성자, 생략가능
	SubjectOne() {}
	
	// 교과목의 정보를 출력하는 메서드
	public void subOne() {
		System.out.println("▶ 과목명 : " + sbName + 
							" / 강의실 : " + sbClass + 
							" / 담당교수 : " + sbProfe);
	}
	// 교과목의 정보를 저정하는 메서드
	public void setSubject(String name, String classroom, String professor) {
		this.sbName = name;
		this.sbClass = classroom;
		this.sbProfe = professor;
	}
	// 교과목의 이름을 조회하는 메서드
	public String getName() {
		return sbName;
	}
}
