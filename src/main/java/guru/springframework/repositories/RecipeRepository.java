package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
