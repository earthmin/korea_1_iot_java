package chapter18;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
class Person {
	// 선택적 필드
	private String name;
	private int age;
	private String hobby;
	private String favoriteFood;
	
	// Person 클래스의내부 Builder 클래스 
	// >> name, age, hobby, favoriteFood에 대한 
	// 선택적 필드 메서드 
}

public class Builder03 {
	public static void main(String[] args) {
		Person ps1 = Person.builder()
					.name("이승아")
					.build();
		Person ps2 = Person.builder()
				.name("이승아")
				.build();
		Person ps3 = Person.builder()
				.name("이승아")
				.build();
		
		
	}

}
