package com.jtmjinfo.coffethymeleaf.controller;

import java.util.List;

import com.jtmjinfo.coffethymeleaf.client.CoffeeClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.jtmjinfo.coffethymeleaf.model.Coffee;


@Controller
public class CoffeeController {

    private final CoffeeClient coffeeClient;

    
    public CoffeeController(CoffeeClient coffeeClient) {
        this.coffeeClient = coffeeClient;
       
    }

    @GetMapping("/home")
    public String home(){

        return "home";
    }
    @GetMapping("/cadastrar")
    public  String cadastrar(){
        return "cadastrar";
    }
    @GetMapping("/")
    public String index(){
        return "home";
    }
    @GetMapping("/editar")
    public String editar(){
        return "editar";
    } 
    
    @GetMapping("/listar")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("listar");
        List<Coffee> coffees = coffeeClient.listarTodos();
        mv.addObject("coffees", coffees);
        return mv;
    }  
    @PostMapping("/cadastrar")
    public ModelAndView salvar(Coffee coffee){
        coffeeClient.saveCoffee(coffee);
        return new ModelAndView("redirect:/listar");
    }  
    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id){
        coffeeClient.deleteCoffee(id);
        return "redirect:/listar";
    }
   
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model){
        Coffee coffee = coffeeClient.getById(id);
        model.addAttribute("coffee", coffee);
        return "editar";
    }
    @PutMapping("/{id}")
    public String updateCoffee(@ModelAttribute Coffee coffee,@PathVariable Long id){
        coffeeClient.updateCoffee(coffee.getId(), coffee);
        return ("redirect:/listar");
    }
    
   
}


