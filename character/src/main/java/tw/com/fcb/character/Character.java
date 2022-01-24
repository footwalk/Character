package tw.com.fcb.character;

public class Character {

	private String Name;
	
	private String Job;
	
	private String IdCode;
	
	private int Power;

	@Override
	public String toString() {
		return "Character [Name=" + Name + ", Job=" + Job + ", IdCode=" + IdCode + ", Power=" + Power + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	public String getIdCode() {
		return IdCode;
	}

	public void setIdCode(String idCode) {
		IdCode = idCode;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}
	
}
