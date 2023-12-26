package com.recipeForYou.backend.domain.ingredient.domain;

import com.recipeForYou.backend.domain.food.domain.Food;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Food food;

    private String ingredientName;
}
