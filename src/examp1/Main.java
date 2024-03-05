package examp1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String isim = input.nextLine();
		
		Ogrenci ogr1 = new Ogrenci();
		
		ogr1.setIsim(isim);
		
		ogr1.getIsim();

	}

}
