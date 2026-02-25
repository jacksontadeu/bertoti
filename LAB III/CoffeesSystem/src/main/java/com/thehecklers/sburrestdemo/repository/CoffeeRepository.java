package com.thehecklers.sburrestdemo.repository;

import com.thehecklers.sburrestdemo.entity.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    Optional<Coffee> findByNome(String name);
    void deleteById(Long id);

    @Query (value="select * from vw_listartodos", nativeQuery = true)
    List<Coffee> testeView();



}
