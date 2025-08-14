package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.entity.model.Coffee;
import com.thehecklers.sburrestdemo.service.CoffeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/coffees")
@RequiredArgsConstructor
@Tag(name = "Coffee API", description = "API REST para controle de Coffees")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @PostMapping("/cadastrar")
    @Operation(summary = "Endpoint usado para Cadastrar coffee ")
    public ResponseEntity<Coffee> cadastrarCoffee(@RequestBody Coffee request){
        Coffee coffee = Coffee.builder()
                .nome(request.getNome())
                .descricao(request.getDescricao())
                .tipo(request.getTipo())
                .preco(request.getPreco())
                .build();
        Coffee coffeeSalvo = coffeeService.cadastrarCoffee(coffee);
        URI uri = URI.create("/coffee/" + coffeeSalvo.getId());

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Endpoint usado para buscar coffee por id ")
    public ResponseEntity<Coffee> buscarPorId(@PathVariable Long id){

        Coffee coffee = coffeeService.buscarPorId(id);
        if (coffee == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(coffee);
    }
    @GetMapping("/listartodos")
    @Operation(summary = "Endpoint usado para listar todos os coffees cadastrados ")
    public ResponseEntity<Iterable<Coffee>> listarTodos(){
        return ResponseEntity.ok(coffeeService.listarCoffees());
    }
}
