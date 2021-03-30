package tv.alphanetworks.exo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import tv.alphanetworks.exo.Repository.CategoryRepository;
import tv.alphanetworks.exo.model.Category;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        final String[] result = {null};
        List<Category> categories = categoryRepository.findAll();

        categories.forEach(category -> {
            category.getAssets().forEach( asset -> {
                RestTemplate restTemplate = new RestTemplate();
                String URL_API_PHP = "http://127.0.0.1:8000/api/asset/" + asset.getAsset_id() + "/downloads";
                ResponseEntity<String> response = restTemplate.getForEntity(URL_API_PHP, String.class);
                result[0] = response.getBody();
                asset.setDownloads(Integer.parseInt(result[0]));
            });
        });
        return categories;
    }
}
