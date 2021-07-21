package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private String key;
	private LocalDate creationDate = null;
	private LocalDate resolutionDate = null;
	private List<String> fv = null;
	private List<String> av = null;
	private Commit fixCommit = null;
	private int numCommits;
	
	public Ticket (String key, LocalDate creationDate, List<String> fv, List<String> av) {
		this.key = key;
		this.creationDate = creationDate;
		this.fv = fv;
		this.av = av;
		this.numCommits = 0;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getResolutionDate() {
		return resolutionDate;
	}

	public void setResolutionDate(LocalDate resolutionDate) {
		this.resolutionDate = resolutionDate;
	}

	public List<String> getFv() {
		return fv;
	}

	public void setFv(List<String> fv) {
		this.fv = fv;
	}
	
	public void removeFv(int i) {
		// rimuove una fixed version dalla lista
		this.fv.remove(i);
	}

	public List<String> getAv() {
		return av;
	}

	public void setAv(List<String> av) {
		this.av = av;
	}
	
	public void addAv(String affected) {
		// aggiunge una affected version alla lista
		if(this.av == null) this.av = new ArrayList<>();
		else if(!this.av.contains(affected)) this.av.add(affected);		
	}
	
	public void removeAv(int i) {
		// rimuove una affected version dalla lista
		this.av.remove(i);
	}

	public Commit getFixCommit() {
		return fixCommit;
	}

	public void setFixCommit(Commit fixCommit) {
		this.numCommits++;	// conta il nuovo commit
		LocalDate newDate = fixCommit.getDate();
		// cambio il valore se non ho resolutionDate o se e' piu' grande di quella che ho
		if(this.resolutionDate == null || this.resolutionDate.compareTo(newDate) < 0) {
			setResolutionDate(newDate);
			this.fixCommit = fixCommit;
		}
	}

	public int getNumCommits() {
		return numCommits;
	}

	public void setNumCommits(int numCommits) {
		this.numCommits = numCommits;
	}
	
	
	
}
