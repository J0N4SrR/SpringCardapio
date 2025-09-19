package rosa.ribeiro.jonas.cardapio.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import rosa.ribeiro.jonas.cardapio.model.FoodModel;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {
}
