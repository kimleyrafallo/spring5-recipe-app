package guru.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.models.UnitOfMeasure;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
    
    Optional<UnitOfMeasure> findByDescription(String description);
}
