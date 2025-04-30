package br.com.unicuritiba.projectstreaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.unicuritiba.projectstreaming.models.Serie;

public interface SerieRepository
		extends JpaRepository<Serie, Long>{
	

}
