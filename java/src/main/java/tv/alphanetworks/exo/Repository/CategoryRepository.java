package tv.alphanetworks.exo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tv.alphanetworks.exo.model.Category;

import java.util.List;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
