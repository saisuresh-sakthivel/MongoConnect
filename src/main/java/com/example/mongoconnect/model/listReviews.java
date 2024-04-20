package com.example.mongoconnect.model;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
@Document(collection = "listingsAndReviews")
public class listReviews {
    private String name;
    private String summary;
    private String space;

    public listReviews() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }


    @Override
    public String toString() {
        return "listReviews{" +
                "name='" + name + '\'' +
                ", summary='" + summary + '\'' +
                ", space='" + space + '\'' +
                '}';
    }
}


