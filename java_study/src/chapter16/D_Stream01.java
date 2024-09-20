package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 스트림 API
// : 컬렉션 데이터를 효율적으로 처리할 수 있는 기능을 제공
// > 람다 표현식과 결합하여 직관적이며 간결한 코드 작성

// cf) Arrays.asList();
// : 일반 배열을 ArrayList로 반환
// >> 원소를 추가하는 메서드를 가지고 있지 X, 사이즈를 바꿀 수 X

// ## java.util.ArrayList와 다른 클래스
public class D_Stream01 {
	public static void main(String[] args) {
		// 기본적인 스트림 처리 예시
		// 1. 리스트에서 짝수만 필터링하고 정렬한 후 출력
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// [1, 2, 3, 4, 5, 6]
		// >> 짝수만 출력
		
		// 기존 방식 (for, if문 사용)
		for (Integer n : numbers) {
			if (n % 2 == 0) {
				System.out.print(n);
			}
		}
		System.out.println(); // 줄바꿈
		
		// 람다 표현식 & 스트림 API
		numbers.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::print);
		
		// == 스트림 API 기본 사용법 ==
		// 1. 스트림 생성 
		List<String> names = Arrays.asList("이승아", "이도경", "김명진");
		
		// cf) .stream 으로 생성된 스트림은 일회성 사용만 가능!
		// >> 한 번 사용한 스트림은 재사용 할 수 없다 
		Stream<String> stream = names.stream();
		
		// 2. 중간 연산 
		// : 여러 개의 체인처럼 연결하여 사용 가능 
		Stream<String> filteredStream = stream.filter(name -> name.startsWith("이"));
		

//		Stream<Integer> lengthStream = stream.map(String::length);
		
		// 3. 최종연산 
		// : 처리를 완료하고 결과를 반환하거나 특정 작업을 수행 
		filteredStream.forEach(System.out::print);
		
		
		
		
		
		
	}
}