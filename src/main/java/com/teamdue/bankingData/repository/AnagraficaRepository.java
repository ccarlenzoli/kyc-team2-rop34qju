package com.teamdue.bankingData.repository;

import com.teamdue.bankingData.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnagraficaRepository extends CrudRepository<Company, String> {

}
