package com.dailywork.cookshare.model;


import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.List;

@Getter
@Setter
public class Recipe {

    private long id;
    private String title;
    private String instruction;
    private String prepTime;
    private String cookTime;
    private String category;
    private String description;
    private String cuisine;
    private String ingredients;

    private int likeCount;
    private double averageRating;
    private int totalRateCount;

    private List<String> ingredients;

    @ManyToOne
    private User user;

    @OneToMany
    private Review review;

    @OneToOne
    private Image image;



}
