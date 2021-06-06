package it.prova.automobilenew.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.prova.automobilenew.model.Automobile;

public interface AutomobileRepository extends PagingAndSortingRepository<Automobile, Long>, JpaSpecificationExecutor<Automobile>{

}
