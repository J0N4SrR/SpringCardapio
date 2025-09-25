package rosa.ribeiro.jonas.cardapio.food.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import rosa.ribeiro.jonas.cardapio.food.model.FoodModel;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {
}
