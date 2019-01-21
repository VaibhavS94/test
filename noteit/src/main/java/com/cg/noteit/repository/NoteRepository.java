package com.cg.noteit.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.cg.noteit.model.Note;
import com.cg.noteit.model.Notebook;

public interface NoteRepository extends CrudRepository<Note, UUID>{
	List<Note> findAllByNotebook(Notebook notebook);
}
