package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Long id, String title, String author, LocalDateTime modifiedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.modifiedDate = modifiedDate;
    }
}
