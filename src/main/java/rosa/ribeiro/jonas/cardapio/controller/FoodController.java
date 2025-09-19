package rosa.ribeiro.jonas.cardapio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rosa.ribeiro.jonas.cardapio.model.FoodModel;
import rosa.ribeiro.jonas.cardapio.repository.FoodRepository;
import rosa.ribeiro.jonas.cardapio.repository.FoodResponseDTO;

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
}

