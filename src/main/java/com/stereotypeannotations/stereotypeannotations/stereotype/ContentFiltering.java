package com.stereotypeannotations.stereotypeannotations.stereotype;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ContentFiltering implements Filterr {

    @Autowired
    private Movie movie;

    public ContentFiltering(){
        super();
    }

    public String[] getRecommendatins(String movie) {
        return new String[]{"MI1","MI2","MI3"};
    }
}
