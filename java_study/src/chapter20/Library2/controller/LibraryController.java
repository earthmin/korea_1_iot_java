package chapter20.Library2.controller;

import java.util.Scanner;

import chapter20.Library2.model.Book;
import chapter20.Library2.model.User;
import chapter20.Library2.service.LibraryService;

public class LibraryController {
	private LibraryService libraryService = new LibraryService();
	// >> 프론트 엔드의 명령을 컨트롤러가 받아서 서비스에게 전달하기 위해 
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		while(running) {
			System.out.println("1: 도서 등록 | 2: 사용자 등록 | 3: 도서 대여 | 4: 도서반납 | 5: 도서 목록 조회 | 6: 종료" );
			
			int choice = sc.nextInt();
			sc.nextLine(); // 개행 문자 소비 
			
			switch(choice) {
			case 1:
				System.out.println("도서 제목: ");
				String title = sc.nextLine();
				
				System.out.println("도서 저자: ");
				String author = sc.nextLine();
				libraryService.addBook(new Book(title, author, false));
				break;
			case 2:
				System.out.println("사용자 이름: ");
				String name = sc.nextLine();
				
				System.out.println("사용자 ID: ");
				String userId = sc.nextLine();
				
				libraryService.registerUser(new User(name, userId));
				break;
				
			case 3: 
				System.out.println("사용자 ID: ");
				userId = sc.nextLine();
				
				System.out.println("도서 제목: ");
				title = sc.nextLine();
				libraryService.borrowBook(userId, title);
				break;
				
			case 4:
				System.out.println("반납할 도서 제목");
				title = sc.nextLine();
				libraryService.returnBook(title);
				break;
				
			case 5:
				libraryService.listAllBook();
				break;
				
			case 6:
				running = false;
				break;
			
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요. ");

			}
		}
		
		sc.close();
	}

}
