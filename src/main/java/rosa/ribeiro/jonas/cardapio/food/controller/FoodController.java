package rosa.ribeiro.jonas.cardapio.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rosa.ribeiro.jonas.cardapio.food.model.FoodModel;
import rosa.ribeiro.jonas.cardapio.food.repository.FoodRepository;
import rosa.ribeiro.jonas.cardapio.food.repository.FoodRequestDTO;
import rosa.ribeiro.jonas.cardapio.food.repository.FoodResponseDTO;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<FoodResponseDTO> getAll(){
        return repository.findAll().stream().map(FoodResponseDTO::new).toList();

    }

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        FoodModel food = new FoodModel(data);
        repository.save(food);

    }
}

