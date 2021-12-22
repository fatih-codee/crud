package patternStructural_Proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;





public class CalisanUtil {
	
	public static List<Calisan> getCalisanList() {
		
		Calisan fatih=new Calisan("fatih","123", true);
		Calisan arda=new Calisan("arda","1234", false);
		Calisan oguzhan=new Calisan("oguzhan","12345", false);
		
		List<Calisan> calisanList = new ArrayList<Calisan>();
		calisanList.add(fatih);
		calisanList.add(arda);
		calisanList.add(oguzhan);
		
		return calisanList;
	}

	
	
	public static Map<String,Calisan> getKullaniciAdiCalisanMap()
	{
		
		List<Calisan> calisanList = getCalisanList();
		Map<String,Calisan>	  map = new LinkedHashMap<>();
		   
		for(Calisan calisan: calisanList) {
			
		  map.put(calisan.getKullaniciAdi(),calisan);
		}
		return map;
		
		
	
		
		
	}
	
	public static  Calisan getCalisanBykullaniciAdi(String kullaniciAdi) {
		
		 Map<String,Calisan> map = getKullaniciAdiCalisanMap();
		 
		 Calisan calisan =map.get(kullaniciAdi);
		  	 
		 return calisan;
	}



	public static boolean iskullaniciValid(String kullaniciAdi, String sifre) {
		
		boolean isKullaniciValid = false;
		
	    Calisan  calisan=  getCalisanBykullaniciAdi(kullaniciAdi);
		
	if(calisan!=null) {
	
		isKullaniciValid =calisan.getSifre().equals(sifre);
	}
	
		
		return isKullaniciValid;
	}
	
	
}
