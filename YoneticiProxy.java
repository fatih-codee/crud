package patternStructural_Proxy;

import java.math.BigDecimal;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

public class YoneticiProxy implements SirketBilgileri {

	private GercekYonetici gercekYonetici;
	
	private String kullaniciAdi;
	
	private String sifre;
	
	
	
	
	
	
	public YoneticiProxy(String kullaniciAdi, String sifre) {
		super();
		this.gercekYonetici = new GercekYonetici();
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}
	
	private boolean isKullaniciYonetici() {
		
		boolean isKullaniciYonetici = false;
		
		boolean isKullaniciValid = CalisanUtil.iskullaniciValid(kullaniciAdi, sifre);
		
		if(isKullaniciValid) {
			 Calisan calisan=CalisanUtil.getCalisanBykullaniciAdi(kullaniciAdi);
			 
			 isKullaniciYonetici = calisan.isYonetici();
		}
	    
		return isKullaniciYonetici;
	}





	@Override
	public BigDecimal getCiro() throws IllegalAccessException {
		
		
		boolean kullaniciYonetici = isKullaniciYonetici();
		
		if(kullaniciYonetici) {
			return gercekYonetici.getCiro();
		}
		else{
			 throw  new IllegalAccessException();
		}
	
	}

}
 