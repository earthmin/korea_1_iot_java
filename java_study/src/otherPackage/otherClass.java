package otherPackage;

// import 패키지명.클래스명;
import chapter07.Example;
 class OtherClass {
	public static void main(String[] args) {
		// 외부 패키지 클래스를 사용한 객체 인스턴스화
		Example ex = new Example();
		
		System.out.println(ex.publicVar); // 1
//		System.out.println(ex.protectedVar);
//		System.out.println(ex.defaultVar);
//		System.out.println(ex.privateVar);
		
		ex.ex1();
//		ex.ex2();
//		ex.ex3();
//		ex.ex4();
	}
}