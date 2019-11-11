
public class Kid {
	private String name;
	private boolean niceness;
	private String present;

	public Kid(String name, String present, boolean niceness) {
		this.name = name; 
		this.present = present;
		this.niceness = niceness;
	}
	
	public Kid() {
		this(null, null, false);
	}

	public String getName() {
		return name;
	}

	public boolean isNiceness() {
		return niceness;
	}

	public String getPresent() {
		return present;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNiceness(boolean niceness) {
		this.niceness = niceness;
	}

	public void setPresent(String present) {
		this.present = present;
	}
	
	public String toString() {
		String s = this.name + " has been ";
		if (this.niceness == true) s += "good";
		else s+= "bad";
		
		s += " this year and wants " + this.present + " for Christmas.";
		return s;
	}

}
