package com.thehecklers.sburrestdemo.service;

import com.thehecklers.sburrestdemo.entity.model.Coffee;
import com.thehecklers.sburrestdemo.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;

    public Coffee cadastrarCoffee(Coffee coffee){
        return coffeeRepository.save(coffee);
    }

    public List<Coffee> listarCoffees(){
        return coffeeRepository.testeView();
    }


   public  Optional<Coffee> buscarPorId(Long id){
        Optional<Coffee> coffee = coffeeRepository.findById(id);
        return coffee;
    }
    public Coffee buscarPorNome(String nome){
        return coffeeRepository.findByNome(nome).orElse(null);
    }
    public void deletarPorId(Long id){
        coffeeRepository.deleteById(id);
    }
    public Coffee editarrCoffee(Coffee coffee){
        return coffeeRepository.save(coffee);
    }



}
