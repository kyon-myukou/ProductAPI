package com.kyon.productapi.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    @Query("select a from ProductEntity a where a.title like :keyword")
    List<ProductEntity> findTitle(@Param("keyword") String keyword);
}
