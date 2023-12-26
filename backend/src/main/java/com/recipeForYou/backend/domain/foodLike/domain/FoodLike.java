package com.recipeForYou.backend.domain.foodLike.domain;

import com.recipeForYou.backend.domain.food.domain.Food;
import com.recipeForYou.backend.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class FoodLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Food food;

    private boolean foodLike;

}
