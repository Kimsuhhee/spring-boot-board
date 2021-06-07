package com.example.springbootmybatisboard.mapper;

import com.example.springbootmybatisboard.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDto> getBoardList();
    BoardDto getBoard(int seq);
    void insertBoard(BoardDto boardDto);
    void updateBoard(BoardDto boardDto);
    void deleteBoard(int seq);
    void updateReads(int seq);
}
