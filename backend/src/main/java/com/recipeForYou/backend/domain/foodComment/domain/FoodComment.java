package com.recipeForYou.backend.domain.foodComment.domain;

import com.recipeForYou.backend.domain.food.domain.Food;
import com.recipeForYou.backend.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class FoodComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Food food;

    @ManyToOne
    private User user;

    private String foodComment;

}
