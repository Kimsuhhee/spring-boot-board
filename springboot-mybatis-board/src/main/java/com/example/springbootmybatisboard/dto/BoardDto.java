package com.example.springbootmybatisboard.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class BoardDto {
    private int seq;
    private String title;
    private String contents;
    private String author;
    private int reads = 0;
    private LocalDateTime createDateTime;
    private LocalDateTime modifiedDateTime;

    @Override
    public String toString() {
        return "BoardDto{" +
                "seq=" + seq +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", author='" + author + '\'' +
                ", reads=" + reads +
                ", createDateTime=" + createDateTime +
                ", modifiedDateTime=" + modifiedDateTime +
                '}';
    }
}
