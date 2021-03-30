package tv.alphanetworks.exo.Services;

import org.springframework.http.ResponseEntity;
import tv.alphanetworks.exo.model.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    public List<Category> findAll();
}
