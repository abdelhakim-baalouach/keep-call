package tv.alphanetworks.exo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long category_id;
    private String category_name;
    @ManyToMany
    @JoinTable( name = "category_asset",
            joinColumns = @JoinColumn( name = "category_id" ),
            inverseJoinColumns = @JoinColumn( name = "asset_id" ) )
    private List<Asset> assets = new ArrayList<>();

}
