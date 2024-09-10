package chapter11;

import java.util.HashMap;
import java.util.Map;

/*
 Map 인터페이스 
 키(key), 값(value)의 쌍으로 요소를 저장하는 데이터 구조 
 - 키는 고유한 데이터 (하나의 값)를 가짐 
 
 == Map의 주요 특징 ==
 : 키의 유일성 
 : 값의 중복 허용 
 >> 순서 보장을 하지 않음 (LinkedHashMap은 순서 보장 O)
 
 1. HashMap
 : 해시 테이블을 사용하여 키-값을 저장 
 >> 순서유지 X (작업 시간 빠름)
 null 허용 (키, 값 모두 허용)
 
 2. LinkedHashMap
 : 삽입 순서를 유지 
 >> 삽입 순서가 중요하고 빠른 검색이 필요할 때 주로 사용 
 
 3. TreeMap
 : 키-값 쌍을 트리에 저장, 키에 따라 정렬
 >> 키에 null 값 허용 X
 
 */

public class E_Map {
	public static void main(String[] args) {
		// == Map 컬렉션 선언 방법 ==
		// Map<키타입, 값타입> 인스턴스명 = new HashMap<키타입, 값타입>();
		
		// cf) 컬렉션 프레임 워크는 객체 저장 시 래퍼 클래스 (참조값 지정)를 사용 
		
		// 래퍼클래스(Wrapper Class): 기본 데이터 타입을 객체로 다루기 위해 사용 
		
		Map<String, Integer> students = new HashMap<String, Integer>();
		// 이름(키), 나이(값)
		
		students.put("이승아", 30);
		students.put("이도경", 30);
		students.put("김명진", 34);
		
		System.out.println(students);
		
		System.out.println(students.get("이도경"));
		
		students.remove("이승아");
		System.out.println(students);
		
		System.out.println(students.containsKey("이도경"));
		System.out.println(students.containsKey("이지훈"));
		
		System.out.println(students.size()); 
		
		System.out.println(students.keySet());
		System.out.println(students.values());
	}

}
