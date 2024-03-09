package br.edu.infnet.elberthmoraes.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.elberthmoraes.model.domain.Professor;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {

}
