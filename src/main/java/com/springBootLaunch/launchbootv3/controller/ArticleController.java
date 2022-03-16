package com.springBootLaunch.launchbootv3.controller;

import com.springBootLaunch.launchbootv3.AjaxResponse;
import com.springBootLaunch.launchbootv3.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/REST")
public class ArticleController {

    // look for an article with given id
    //@RequestMapping(value="/articles/{id}" , method = RequestMethod.GET )
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        Article article = Article.builder()
                .title("SpringBootDemo")
                .author("Number 1 writer")
                .content("This is a demo.")
                .id(id)
                .build();
        log.info("article: " + article);

        return AjaxResponse.success(article, "Request success.");
    }

    // add a new article
    //@RequestMapping(value="/articles" , method = RequestMethod.POST )
    @PostMapping("/articles")
    public AjaxResponse addArticle(@RequestBody Article article) {
        log.info("Addging an article: " + article);

        return AjaxResponse.success();
    }

    // Edit an article
    //@RequestMapping(value="/articles" , method = RequestMethod.PUT )
    @PutMapping("/articles")
    public AjaxResponse editArticle(@RequestBody Article article) {
        if (article.getId() == null) {

        }
        log.info("Editing an article: " + article);

        return AjaxResponse.success();
    }

    // Delete an article
    //@RequestMapping(value="/articles" , method = RequestMethod.DELETE )
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        if (id == null) {

        }
        log.info("Deleting an article: " + id);

        return AjaxResponse.success();
    }
}
