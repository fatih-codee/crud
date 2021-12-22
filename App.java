package patternStructural_Proxy;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
	   YoneticiProxy proxy=	new YoneticiProxy("özgür", "123");
	   
	
	   
	try {
		 BigDecimal  ciro = proxy.getCiro();
		System.out.println("Sirket Cirosu = "+ ciro);
	} catch (IllegalAccessException e) {
		
		System.out.println("Yetkisiz kullanici");
	}
	   
	   

	}

}
