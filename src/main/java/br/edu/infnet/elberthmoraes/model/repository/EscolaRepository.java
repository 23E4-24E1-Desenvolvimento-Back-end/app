package br.edu.infnet.elberthmoraes.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.elberthmoraes.model.domain.Escola;

@Repository
public interface EscolaRepository extends CrudRepository<Escola, Integer> {

}
