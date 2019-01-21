package com.cg.noteit.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Notebook {
	
	@Id
	private UUID id;
	private String name;
	
	@JsonIgnore
	private List<Note> notes;
	
	protected Notebook(){
		this.id = UUID.randomUUID();
		this.notes = new ArrayList<>();
	}
	
	public Notebook(String name){
		this();
		this.name = name;
	}
	
	public Notebook(String id, String name){
		this();
		if(id != null){
			this.id = UUID.fromString(id);
		}
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	public int getNbOfNotes(){
		return this.notes.size();
	}
	
	
}
