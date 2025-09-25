package rosa.ribeiro.jonas.cardapio.food.model;

import jakarta.persistence.*;
import lombok.*;
import rosa.ribeiro.jonas.cardapio.food.repository.FoodRequestDTO;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;


    public FoodModel(FoodRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
