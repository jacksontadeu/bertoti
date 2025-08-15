package com.thehecklers.sburrestdemo.service;

import com.thehecklers.sburrestdemo.entity.model.Coffee;
import com.thehecklers.sburrestdemo.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;

    public Coffee cadastrarCoffee(Coffee coffee){
        return coffeeRepository.save(coffee);
    }

    public List<Coffee> listarCoffees(){
        return coffeeRepository.findAll();
    }
    public Coffee buscarPorId(Long id){
        return coffeeRepository.findById(id).orElse(null);
    }
    public Coffee buscarPorNome(String nome){
        return coffeeRepository.findByNome(nome).orElse(null);
    }
    public void deletarPorId(Long id){
        coffeeRepository.deleteById(id);
    }



}
