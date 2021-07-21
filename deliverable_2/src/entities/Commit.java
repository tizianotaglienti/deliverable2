package entities;

import java.time.LocalDate;
import java.util.List;

public class Commit {

	private String sha;			
	private String message;		 
	private LocalDate date;		
	private String author;
	private List<ReleaseFile> files;	//list of the files committed
	
	
	public Commit(String sha, String message, LocalDate date, String author){
		
		this.sha = sha;
		this.message = message;
		this.date =  date;
		this.author = author;
		this.files = null;
		
	}

	
	public String getSha() {
		return sha;
	}


	public void setSha(String sha) {
		this.sha = sha;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public List<ReleaseFile> getFiles() {
		return files;
	}


	public void setFiles(List<ReleaseFile> files) {
		this.files = files;
	}

}
