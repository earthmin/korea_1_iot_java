package chapter04;

// 클래스 생성 

class Dog {
	// 클래스 내부의 데이터(속성)
	String name;
	int age;
	
	// 클래스의 내부의 동작 (메서드)
	void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
	Dog(String dogname, int age) {
		name = dogname;
		this.age = age; // 매개변수랑 헷갈려서 this를 써라 
		
	}
}
public class Object04 {
	public static void main(String[] args) {
		 Dog myDog = new Dog("Maru", 5);
		 
		 System.out.println(myDog.name);
		 System.out.println(myDog.age);
		 
		 myDog.displayInfo();	 
		 
		 // == 생성자 함수 ==
		 // : new 연산자 사용 시 호출 될 메서드 
		 // >> 생략 시 속성에 기본값이 할당 
		 // 일반타입: int(0), boolean(false), char("")
		 // 참조타입: null 
		 
		 // >> 생략시 클래스명과 동일하면서 매개변수가 없는 메서드
	}

}
