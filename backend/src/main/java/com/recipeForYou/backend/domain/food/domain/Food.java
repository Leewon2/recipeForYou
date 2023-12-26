package com.recipeForYou.backend.domain.food.domain;

import com.recipeForYou.backend.domain.foodComment.domain.FoodComment;
import com.recipeForYou.backend.domain.foodLike.domain.FoodLike;
import com.recipeForYou.backend.domain.ingredient.domain.Ingredient;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String foodName;

    private Integer price;

    private Date time;

    private Integer calorie;

    private String level;

    private Integer viewCount;

    private String vitaminCategory;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredient> ingredients = new ArrayList<>();

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FoodLike> foodLikes = new ArrayList<>();

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FoodComment> foodComments = new ArrayList<>();



}
