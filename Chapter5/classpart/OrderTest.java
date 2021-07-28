package classpart;

public class OrderTest {

	public static void main(String[] args) {
		// 인스턴스로 생성한 후 책에 있는 주문 내용대로 출력해보기
		
		Order order = new Order();
		
		order.orderId =201803120001L;
		order.id = "adc123";
		order.orderDate = "2018년 3월 12일";
		order.name = "홍길순";
		order.productNum = "PD0345-12";
		order.deliveryAdress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호:" + order.orderId);
		System.out.println("주문자 아이디:" + order.id);
		System.out.println("주문 날짜:" + order.orderDate);
		System.out.println("주문자 이름:" + order.name);
		System.out.println("주문 상품 번호:" + order.productNum);
		System.out.println("배송 주소:" + order.deliveryAdress);

	}

}
