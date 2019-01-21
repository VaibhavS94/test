package com.cg.noteit.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Note {
	
	@Id
	private UUID id;
	private String title;
	private String text;
	
	private Notebook notebook;
	
	private Date lastModifiedOn;
	
	protected Note(){
		this.id = UUID.randomUUID();
		this.lastModifiedOn = new Date();
	}

	public Note(String title, String text, Notebook notebook) {
		super();
		this.title = title;
		this.text = text;
		this.notebook = notebook;
	}
	
	public Note(String id, String title, String text, Notebook notebook){
		this(title,text,notebook);
		if(id != null){
			this.id = UUID.fromString(id);
		}
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Notebook getNotebook() {
		return notebook;
	}

	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}

	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}
	
	public String getNotebookId(){
		return this.notebook.getId().toString();
	}
	
	

}
