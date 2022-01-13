package com.teamdue.bankingData.repository;

import com.teamdue.bankingData.model.Anagrafica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnagraficaRepository extends CrudRepository<Anagrafica, String> {

}
