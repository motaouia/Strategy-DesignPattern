package org.motaouia.firstexp.strategy;

public class ShoppingCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		ShoppingCard shoppingCard = new ShoppingCard();
		
		shoppingCard.addItem(item1);
		shoppingCard.addItem(item2);
		
		shoppingCard.pay(new CreditCardStrategy("Med Mota", "1234567890123456", "786", "12/15"));
		shoppingCard.pay(new PaypalStrategy("med.mota@email.org", "AZERTY"));

	}

}
