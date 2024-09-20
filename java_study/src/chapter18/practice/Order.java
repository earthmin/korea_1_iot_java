package chapter18.practice;
// 주문 클래스

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Order {
	private final String orderId;
	private final Customer customer;
	private final List<Product> products;
	private final double totalPrice;
	
	
 public static double calculateTotalPrice(List<Product> products) {
	 
	 return products.stream().mapToDouble(Product::getPrice).sum();

} 
}
