package com.springBootLaunch.launchbootv3.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Article {
    private String title;
    private String author;
    private String content;
    private Long id;
}
