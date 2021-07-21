package entities;

import java.time.LocalDateTime;

public class Release {

	private LocalDateTime dateTime;		// data della release
	private String releaseName;			// nome della release
	private String id;					// indice della release
	
	public Release(LocalDateTime dateTime, String releaseName, String id) {
		this.dateTime = dateTime;
		this.releaseName = releaseName;
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getReleaseName() {
		return releaseName;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
