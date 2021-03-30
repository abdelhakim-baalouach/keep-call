package tv.alphanetworks.exo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tv.alphanetworks.exo.model.Asset;

@RepositoryRestResource
public interface AssetRepository extends JpaRepository<Asset, Long> {
}
