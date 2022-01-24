package tw.com.fcb.character;

import java.util.List;

public class CharacterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterFilterImpl filter = new CharacterFilterImpl();
		
		Character new1 = filter.getByCode("1");
		System.out.println("name = " + new1.getName());
		
		List<Character> new2 = filter.getByJob("Fighter");
		System.out.println("Fighter is ");
		for(int i = 0; i < new2.size(); i++) {
			System.out.println(new2.get(i).getName());
		}
		
		List<Character> new3 = filter.getByPower(100, 1000000);
		System.out.println("Power between 100~1000000");
		for(int i = 0; i < new3.size(); i++) {
			System.out.println(new3.get(i).getName());
		}
		
		
		List<Character> new4 = filter.getByPower(100, 6000);
		System.out.println("Power between 100~6000");
		for(int i = 0; i < new4.size(); i++) {
			System.out.println(new4.get(i).getName());
		}
	}

}
