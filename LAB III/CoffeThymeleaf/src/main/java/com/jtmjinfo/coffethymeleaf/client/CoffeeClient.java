package com.jtmjinfo.coffethymeleaf.client;

import com.jtmjinfo.coffethymeleaf.model.Coffee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="CoffeClient", url = "${spring.feign.url}")
public interface CoffeeClient {

    @RequestMapping(method = RequestMethod.GET, value = "listartodos")
    List<Coffee> listarTodos();

    @RequestMapping(method = RequestMethod.POST, value="")
    void saveCoffee(@RequestBody Coffee coffee);

    @RequestMapping(method = RequestMethod.DELETE, value="{id}")
    void deleteCoffee(@PathVariable Long id);

    @RequestMapping(method = RequestMethod.GET, value="{id}")
    Coffee getById(@PathVariable Long id);

    @RequestMapping(method = RequestMethod.PUT, value="{id}")
    void updateCoffee(@PathVariable Long id, @RequestBody Coffee coffee);
}
