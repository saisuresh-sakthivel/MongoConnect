package com.example.mongoconnect.Repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongoconnect.model.listReviews;

public interface listReviewsRepo extends MongoRepository<listReviews,String>
{

}
