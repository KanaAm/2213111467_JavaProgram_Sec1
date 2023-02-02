
public class Theater extends Movie{
	public int theaterNo;
	public Theater(String id,String name,Director director,int theaterNo) {
		super(id,name,director);
		this.theaterNo=theaterNo;
	}
	public Theater() {
		
	}
	
	public String getTheaterName() {
		String theater;
		if (theaterNo >0 && theaterNo <12) {
			theater = "Basic Theater";
		}
		else if (theaterNo >11 && theaterNo <15) {
			theater = "Sweet Theater";
		}
		else if (theaterNo >14 && theaterNo ==15) {
			theater = "Premium Theater";
		}
		else
			theater = null;
		return theater;
	}
	@Override
	public String toString() {
		return getTheaterName()+":"+super.toString();
	}
}
