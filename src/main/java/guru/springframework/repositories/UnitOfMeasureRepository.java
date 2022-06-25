package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.models.UnitOfMeasure;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
    
}
