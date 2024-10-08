package chapter11;

import java.util.HashSet;
import java.util.Set;

/*
 Set 인터페이스 
 : 중복된 요소를 포함하지 않는 객체의 집합 
 >> 객체의 저장 순서를 저장하지 않음 (삽입 순서 유지 X)
 >> null 요소 포함 가능
 
 == Set 컬렉션 종류 ==
  
  1. HashSet
  : 가장 많이 사용되는 set 구현체, 빠른 성능을 제공 
  >> 삽입 순서나 요소의 정렬 상태를 보장 X
  
  2. LinkedHashSet
  : HastSet에서 순서를 추가한 형태 
  >> 요소를 삽입 순서대로 유지 
  
  3. TreeSet
  : 정렬된 순서대로 유지 
  >> 요소의 순서가 중요하거나 정렬 상태를 유지해야 할 때 사용 
  >> 자동 정렬 
 */

public class D_Set {
	public static void main(String[] args) {
		// Set 컬렉션의 주요 메서드 
		// add, remove, contains, size
		// isEmpty: Set이 비워져 있는지 확인 
		
		// == HashSet 클래스 선언 방법 ==
		// Set<E> set명 = new HashSet<E>();
		
		
		Set<String> set = new HashSet<String>();
		
		set.add("자바");
		set.add("파이썬");
		set.add("C++");
		set.add("자바스크립트");
		
		System.out.println(set);
		
		set.remove("자바");
		System.out.println(set);
		
		set.add("C++");
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println(set.contains("자바스크립트"));
		
		set.clear();
		System.out.println(set.size());
		System.out.println(set.isEmpty()); 
	}
	

}
