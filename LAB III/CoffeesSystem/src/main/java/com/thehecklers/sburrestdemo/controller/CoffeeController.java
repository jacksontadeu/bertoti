package com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.entity.model.Coffee;
import com.thehecklers.sburrestdemo.service.CoffeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/coffees")
@RequiredArgsConstructor
@Tag(name = "Coffee API", description = "API REST para controle de Coffees")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @PostMapping()
    @Operation(summary = "Endpoint usado para Cadastrar coffee ")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Coffee cadastrado com sucesso"),
    @ApiResponse(responseCode = "400", description = "Erro ao cadastrar coffee")})
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
        Optional<Coffee> coffee  = coffeeService.buscarPorId(id);
        if (coffee.isPresent()){
            return ResponseEntity.ok(coffee.get());

        }else{
            return ResponseEntity.notFound().build();
        }

    }
    @GetMapping("/listartodos")
    @Operation(summary = "Endpoint usado para listar todos os coffees cadastrados ")
    public ResponseEntity<Iterable<Coffee>> listarTodos(){
        return ResponseEntity.ok(coffeeService.listarCoffees());
    }
    @GetMapping("/buscarpornome")
    @Operation(summary = "Endpoint usado para buscar coffee por nome ")
    public ResponseEntity<Coffee> buscarPorNome(@RequestParam String nome){
        Coffee coffee = coffeeService.buscarPorNome(nome);
        if (coffee == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(coffee);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Endpoint usado para deletar coffee por id ")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Coffee deletado com sucesso"),
    @ApiResponse(responseCode = "404", description = "Coffee não encontrado")})
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id){
        Optional<Coffee> coffee = coffeeService.buscarPorId(id);
        if (coffee.isPresent()){
            coffeeService.deletarPorId(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> editarCoffee(@RequestBody Coffee coffee, @PathVariable Long id){
        Optional<Coffee> coffeeEntity = coffeeService.buscarPorId(id);
        if(coffeeEntity.isPresent()){
            coffeeEntity.get().setNome(coffee.getNome());
            coffeeEntity.get().setTipo(coffee.getTipo());
            coffeeEntity.get().setDescricao(coffee.getDescricao());
            coffeeEntity.get().setPreco(coffee.getPreco());
            coffeeService.editarrCoffee(coffeeEntity.get());

            return ResponseEntity.status(HttpStatus.OK).build();
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
}
