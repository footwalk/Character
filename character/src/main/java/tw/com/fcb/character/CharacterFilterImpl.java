package tw.com.fcb.character;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class CharacterFilterImpl implements CharacterFilter {

	private Map<String,Character> Hero = new HashMap<String, Character>();
	
	public CharacterFilterImpl() {
		
		Character Hero1 = new Character();
		Hero1.setName("IronMan");
		Hero1.setJob("BussinessMan");
		Hero1.setIdCode("1");
		Hero1.setPower(10000);	

		Character Hero2 = new Character();
		Hero2.setName("Hauk");
		Hero2.setJob("Doctor");
		Hero2.setIdCode("2");
		Hero2.setPower(100000);	
		
		Character Hero3 = new Character();
		Hero3.setName("CaptainAmerica");
		Hero3.setJob("Fighter");
		Hero3.setIdCode("3");
		Hero3.setPower(20000);	
		
		Character Hero4 = new Character();
		Hero4.setName("EagleEye");
		Hero4.setJob("Archer");
		Hero4.setIdCode("4");
		Hero4.setPower(5000);	
		
		Hero.put(Hero1.getIdCode(), Hero1);
		Hero.put(Hero2.getIdCode(), Hero2);
		Hero.put(Hero3.getIdCode(), Hero3);
		Hero.put(Hero4.getIdCode(), Hero4);

	}

	@Override
	public Character getByCode(String code) {
		// TODO Auto-generated method stub
		return Hero.get(code);
	}

	@Override
	public List<Character> getByJob(String HeroName) {
		// TODO Auto-generated method stub
		List<Character> result = new ArrayList<Character>();
		
		for(String key :Hero.keySet()) {
			Character FitHero = Hero.get(key);
			if(FitHero.getJob().equals(HeroName)) {
				result.add(FitHero);
			}
		}
		return result;
	}

	@Override
	public List<Character> getByPower(int LowPower, int HighPower) {
		// TODO Auto-generated method stub
		List<Character> result = new ArrayList<Character>();
		
		for(String key :Hero.keySet()) {
			Character FitHero = Hero.get(key);
			if((FitHero.getPower() <= HighPower) && (FitHero.getPower() >= LowPower)) {
				result.add(FitHero);
			}
		}
		return result;
	}
}
