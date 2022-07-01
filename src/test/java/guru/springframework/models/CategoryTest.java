package guru.springframework.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    private Category category;

    @Before
    public void setup() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 3L;

        category.setId(3L);

        assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {

    }

    @Test
    public void getRecipes() {
    }
}