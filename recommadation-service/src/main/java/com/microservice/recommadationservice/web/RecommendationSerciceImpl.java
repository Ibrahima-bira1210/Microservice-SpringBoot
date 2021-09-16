package com.microservice.recommadationservice.web;

import com.microservice.recommadationservice.entities.Recommadation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RecommendationSerciceImpl implements RecommandationService{

    private static final Logger LOG = LoggerFactory.getLogger(RecommendationSerciceImpl.class);
    @Override
    public List<Recommadation> getRecommendations(Long productId) {
        if(productId ==123){
            LOG.debug("no recommendations founds for productId: {}",productId);
            return new ArrayList<>();
        }
        List<Recommadation> list = new ArrayList<>();
        list.add(new Recommadation(productId,1,"Author 1",1,"content1"));
        list.add(new Recommadation(productId,1,"Author 2",2,"content2"));
        list.add(new Recommadation(productId,1,"Author 3",3,"content3"));
        LOG.debug("/recommendation response size: {}", list.size());
        return list;

    }
}
