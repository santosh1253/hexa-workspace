package Entity;

public class Skills {
	
	private String skillname;
	private int rating;
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Skills [skillname=" + skillname + ", rating=" + rating + "]";
	}
	

}
