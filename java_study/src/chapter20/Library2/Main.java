package chapter20.Library2;

import chapter20.Library2.controller.LibraryController;

//Library2 패키지
//> controller - LibraryController
//> model - Book, User
//> repository - BookRepository, UserRepository
//> service - LibraryService
//Main.java (클래스 파일 - 실행 메서드 포함)


public class Main {
	public static void main(String[] args) {
		LibraryController controller = new LibraryController();
		controller.start();
	}

}
