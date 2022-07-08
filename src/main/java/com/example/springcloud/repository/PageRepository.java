package com.example.springcloud.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.example.springcloud.entity.Page;
import java.util.Optional;

public interface PageRepository extends CosmosRepository<Page,Integer> {
    Optional<Page> findByLink(String link);

    Page getById(int id);
}
