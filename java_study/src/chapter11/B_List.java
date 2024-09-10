package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class B_List {
	public static void main(String[] args) {
		// ArratList 사용 예시
		System.out.println("=== ArratList === ");
		
		// - new 생성자를 사용하여 ArrayList 객체를 생성 
		// >> 일반 데이터 타입 X, "클래스 객체 데이터" 타입 
		// EX) String, Number, Boolean
		
		// 컬렉션명<객체데이터>변수명 = new 컬렉션명<객체데이터>();
		ArrayList<String> strArray = new ArrayList<String>();		
		
		System.out.println(strArray.size());
		
		strArray.add("JAVA");
		strArray.add("PYTHON");
		strArray.add("JS");
		strArray.add("TS");
		
		System.out.println(strArray.size());
		System.out.println(strArray);
		
		strArray.add(1, "REACT");
		System.out.println(strArray);
		
		String element = strArray.get(1);
		System.out.println(element);
		
		System.out.println(strArray.remove(1));
		System.out.println(strArray);
		
		System.out.println(strArray.set(1, "C++"));
		System.out.println(strArray); 
		
		 // == 2. LinkedList 사용 예시 ===
		System.out.println("== LinkedList ==");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		
		System.out.println(linkedList);
		
		linkedList.add(1, "Mango");
		System.out.println(linkedList);
		
		String fruitElement = linkedList.get(2);
		System.out.println(fruitElement);
		
		String isFruit1 = "Orange";
		String isFruit2 = "Strawberry";
		
		System.out.println(linkedList.contains(isFruit1));
		System.out.println(linkedList.contains(isFruit2));
		
		linkedList.clear();
		System.out.println(linkedList);
		
		// cf) List 컬렉션 프레임 워크 사용 시 유의 사항 
		
		//  get, remove, set 메서드 사용 시 
		// : 인덱스번호를 사용하는 메서드 
		// >> 인덱스 번호가 유효한지 검사 (유효하지 않은 경우 IndexOutOfBounds 예외)
		
		// 
		
		}

}
