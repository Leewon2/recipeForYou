package com.recipeForYou.backend.domain.articleComment.domain;

import com.recipeForYou.backend.domain.article.domain.Article;
import com.recipeForYou.backend.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class ArticleComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Article article;

    @ManyToOne
    private User user;

    private String articleComment;

}
