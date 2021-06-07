package com.example.springbootmybatisboard.service;

import com.example.springbootmybatisboard.dto.BoardDto;
import com.example.springbootmybatisboard.mapper.BoardMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<BoardDto> getBoardList() {
        return boardMapper.getBoardList();
    }

    @Override
    public BoardDto getBoard(int seq) {
        return boardMapper.getBoard(seq);
    }

    @Override
    public void insertBoard(BoardDto boardDto) {
        boardMapper.insertBoard(boardDto);
    }

    @Override
    public void updateBoard(BoardDto boardDto) {
        boardMapper.updateBoard(boardDto);
    }

    @Override
    public void deleteBoard(int seq) {
        boardMapper.deleteBoard(seq);
    }

    @Override
    public void updateReads(int seq) {
        boardMapper.updateReads(seq);
    }

}

