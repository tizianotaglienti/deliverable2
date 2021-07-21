package entities;

import java.util.ArrayList;
import java.util.List;

public class Metrics {
	
	private Integer release;
	private String file;		// private File file;
	
	private int loc;			// linee di codice
	private int locTouched;		// linee di codice aggiunte, cancellate o modificate
	private int locAdded;		// linee di codice aggiunte
	private int maxLocAdded;
	
	private List<String> auth;	// lista degli autori del file
	private int nAuth;			// numero di autori
	
	private int churn;			// linee di codice aggiunte - cancellate
	private int maxChurn;
	private int avgChurn;
	
	private int nFix;			// numero di bug fixati
	private int revs;			// numero di revisioni
	private int chgSetSize;		// numero di file committati
	
	private String bugginess;
	
	public Metrics (int release, String file) {
		this.release = release;
		this.file = file;
		this.loc = 0;
		this.locTouched = 0;
		this.locAdded = 0;
		this.auth = new ArrayList<>();
		this.nAuth = 0;
		this.maxLocAdded = 0;
		this.churn = 0;
		this.maxChurn = 0;
		this.avgChurn = 0;
		this.nFix = 0;
		this.revs = 0;
		this.chgSetSize = 0;
		this.bugginess = "No";
	}

	public Integer getRelease() {
		return release;
	}

	public void setRelease(Integer release) {
		this.release = release;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}

	public int getLocTouched() {
		return locTouched;
	}

	public void setLocTouched(int locTouched) {
		this.locTouched = locTouched;
	}
	
	public void addLocTouched (int loc) {
		// aggiunge loc al numero di locTouched
		this.locTouched += loc;
	}

	public int getLocAdded() {
		return locAdded;
	}

	public void setLocAdded(int locAdded) {
		this.locAdded = locAdded;
	}
	
	public void addLocAdded(int loc) {
		// aggiunge loc al numero di locAdded
		this.locAdded += loc;		
		if(this.maxLocAdded < loc) {
			// aggiorna il valore di maxLocAdded
			this.maxLocAdded = loc;
		}
	}

	public int getMaxLocAdded() {
		return maxLocAdded;
	}

	public void setMaxLocAdded(int maxLocAdded) {
		this.maxLocAdded = maxLocAdded;
	}

//	public float getAvgLocAdded() {
	// restituisce il numero medio di locAdded
//		float avg;
//		if(this.locAdded == 0) avg = 0;
//		else avg = (float) this.locAdded/this.revs;
//		return avg;
//	}
	
	public List<String> getAuth() {
		return auth;
	}

	public void setAuth(List<String> auth) {
		this.auth = auth;
	}

	public void addAuthor(String author) {
		// aggiunge un autore alla lista
		if(!this.auth.contains(author)) this.auth.add(author);
	}
	
	public int getnAuth() {
		// restituisce il numero di autori per il file
		return auth.size();
	}

//	public void setnAuth(int nAuth) {
//		this.nAuth = nAuth;
//	}

	public int getChurn() {
		return churn;
	}

	public void setChurn(int churn) {
		this.churn = churn;
	}

	public int getMaxChurn() {
		return maxChurn;
	}

	public void setMaxChurn(int maxChurn) {
		this.maxChurn = maxChurn;
	}

	public int getAvgChurn() {
		return avgChurn;
	}

	public void setAvgChurn(int avgChurn) {
		this.avgChurn = avgChurn;
	}

	public int getnFix() {
		return nFix;
	}

	public void setnFix(int nFix) {
		this.nFix = nFix;
	}

	public void addFix() {
		// aggiunge un bug fixato
		this.nFix++;
	}
	
	public int getRevs() {
		return revs;
	}

	public void setRevs(int revs) {
		this.revs = revs;
	}
	
	public void addRev() {
		// aggiunge una revisione
		this.revs++;
	}

	public int getChgSetSize() {
		return chgSetSize;
	}

	public void setChgSetSize(int chgSetSize) {
		this.chgSetSize = chgSetSize;
	}
	
	public void addChgSetSize(int x) {
		// aggiunge al change set size il numero di file committati insieme
		this.chgSetSize += x;
	}

	public String getBugginess() {
		return bugginess;
	}

	public void setBugginess(String bugginess) {
		this.bugginess = bugginess;
	}
	
}
