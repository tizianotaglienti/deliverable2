package entities;

public class ReleaseFile {

	private String name;		// nome del file
	private int loc;			// linee di codice
	private int locTouched;		// linee di codice aggiunte, cancellate o modificate
	private int locAdded;		// linee di codice aggiunte
	
	public ReleaseFile(String name, int loc, int locAdded, int locTouched) {
		this.name = name;
		this.setLoc(loc);
		this.locAdded = locAdded;
		this.locTouched = locTouched;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}

	public int getLocAdded() {
		return locAdded;
	}

	public void setLocAdded(int locAdded) {
		this.locAdded = locAdded;
	}

	public int getLocTouched() {
		return locTouched;
	}

	public void setLocTouched(int locTouched) {
		this.locTouched = locTouched;
	}	
	
}

