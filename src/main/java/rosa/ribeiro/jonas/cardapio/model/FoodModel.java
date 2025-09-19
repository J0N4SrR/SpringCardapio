package rosa.ribeiro.jonas.cardapio.model;

import jakarta.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")
public class FoodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
