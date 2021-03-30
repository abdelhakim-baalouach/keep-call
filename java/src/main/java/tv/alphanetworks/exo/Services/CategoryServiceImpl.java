package tv.alphanetworks.exo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tv.alphanetworks.exo.Repository.CategoryRepository;
import tv.alphanetworks.exo.model.Category;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
