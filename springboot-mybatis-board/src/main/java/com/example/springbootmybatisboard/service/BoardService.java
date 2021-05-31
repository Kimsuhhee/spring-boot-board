package com.example.springbootmybatisboard.service;

import com.example.springbootmybatisboard.dto.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> getBoardList();
    BoardDto getBoard(int seq);
    void insertBoard(BoardDto boardDto);
    void updateBoard(BoardDto boardDto);
    void deleteBoard(int seq);
}
