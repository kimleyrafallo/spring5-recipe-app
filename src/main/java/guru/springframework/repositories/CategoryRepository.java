package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    
}
