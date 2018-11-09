package by.cdptr.les08.main;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private static List<Good> goods = new ArrayList<Good>();

	public Payment() {
	}

	public void add(Good good) {
		goods.add(good);
	}
	public List<Good> getGoods(){
		return goods;
		}

	public static void main(String [] args) {
	  Payment payment = new Payment();
	  payment.add(new Good("Milk", 2.5));
	  payment.add(new Good("Bread", 2));
      payment.add(new Good("Meat", 9));
      
      print(goods);
     
    	  } 
	 public static void print(List<Good> goods){
   	 
   	  System.out.println(goods);
   	 
   	  
  }
}
