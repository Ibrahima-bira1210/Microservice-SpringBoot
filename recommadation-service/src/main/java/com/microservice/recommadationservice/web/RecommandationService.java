package com.microservice.recommadationservice.web;

import com.microservice.recommadationservice.entities.Recommadation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RecommandationService {

    @GetMapping(
            value = "/recommendation",
            produces = "application/json"

    )
    List<Recommadation> getRecommendations(@RequestParam(value = "productId", required = true) Long productId);
}
