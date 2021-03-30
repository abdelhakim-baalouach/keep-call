package tv.alphanetworks.exo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long asset_id;
    private String asset_name;

    @JsonIgnore
    @Transient
    private long downloads;

    @ManyToMany
    @JoinTable( name = "category_asset",
            joinColumns = @JoinColumn( name = "asset_id" ),
            inverseJoinColumns = @JoinColumn( name = "category_id" ) )
    @JsonIgnore
    private List<Category> categories = new ArrayList<>();
}
