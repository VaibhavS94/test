package com.cg.noteit.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.cg.noteit.model.Notebook;

public interface NotebookRepository extends CrudRepository<Notebook, UUID>{

}
