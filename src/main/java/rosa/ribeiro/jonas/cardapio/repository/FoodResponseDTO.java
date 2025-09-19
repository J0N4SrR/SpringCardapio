package rosa.ribeiro.jonas.cardapio.repository;

import rosa.ribeiro.jonas.cardapio.model.FoodModel;

public record FoodResponseDTO(Long id, String title, String images, Integer price) {
    public FoodResponseDTO(FoodModel food) {
        this(food.getId(),food.getTitle(),food.getImage(), food.getPrice());
    }
}
