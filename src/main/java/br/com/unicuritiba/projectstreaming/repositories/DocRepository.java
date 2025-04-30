package br.com.unicuritiba.projectstreaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.projectstreaming.models.Doc;

public interface DocRepository
		extends	JpaRepository<Doc, Long>{
	

}
