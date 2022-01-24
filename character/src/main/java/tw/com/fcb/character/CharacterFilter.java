package tw.com.fcb.character;

import java.util.List;

public interface CharacterFilter {

	public Character getByCode(String code);
	
	public List<Character> getByJob(String singerName);
	
	public List<Character> getByPower(int LowPower, int HighPower);
	
}
