package com.recipeForYou.backend.domain.article.domain;

import com.recipeForYou.backend.domain.articleComment.domain.ArticleComment;
import com.recipeForYou.backend.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Builder
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArticleComment> articleComments = new ArrayList<>();

    private String content;

    private String title;

    private Integer view_count;
}
