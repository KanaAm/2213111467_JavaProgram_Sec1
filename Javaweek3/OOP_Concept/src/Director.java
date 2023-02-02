
public class Director {
	private String name;
	private String email;
	private char gender;
	public Director(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Director(String name,String email) {
		this.name = null;
		this.email = null;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		String gen;
		switch(gender) {
		case('f'):
			gen = "female"; break;
		case('m'):
			gen = "male";	break;
		case('F'):
			gen = "female"; break;
		case('M'):
			gen = "male";	break;
		default:
			gen = null;
		}
		return gen;
	}
	@Override
	public String toString() {
		return getName()+" ("+getEmail()+";"+getGenderName()+")";
	}
}
