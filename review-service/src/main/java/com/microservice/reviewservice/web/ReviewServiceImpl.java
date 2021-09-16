package com.microservice.reviewservice.web;

import com.microservice.reviewservice.entities.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ReviewServiceImpl implements ReviewService{
    private static final Logger LOG = LoggerFactory.getLogger(ReviewServiceImpl.class);

    @Override
    public List<Review> getReviews(Long productId) {
        if(productId ==223){
            LOG.debug("no recommendations founds for productId: {}",productId);
            return new ArrayList<>();
        }
        List<Recommadation> list = new ArrayList<>();
        list.add(new Review(productId,1,"Author 1",1,"content1"));
        list.add(new Review(productId,1,"Author 2",2,"content2"));
        list.add(new Review(productId,1,"Author 3",3,"content3"));
        LOG.debug("/review response size: {}", list.size());
        return list;    }
}
