package com.example.springbootmybatisboard.controller;

import com.example.springbootmybatisboard.dto.BoardDto;
import com.example.springbootmybatisboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping
    public List<BoardDto> BoardList() {
        return boardService.getBoardList();
    }

    @GetMapping("/{boardSeq}")
    public BoardDto Board(@PathVariable("boardSeq") int seq){
        return boardService.getBoard(seq);
    }

    @PostMapping
    public String insertBoard(BoardDto boardDto){
        boardService.insertBoard(boardDto);
        return "추가OK";
    }

    @PutMapping("/{boardSeq}")
    public String update(@PathVariable("boardSeq") int seq, BoardDto boardDto){
        boardDto.setSeq(seq);
        boardService.updateBoard(boardDto);
        System.out.println(boardDto.toString());
        return "수정OK";
    }

    @DeleteMapping("/{boardSeq}")
    public String deleteBoard(@PathVariable("boardSeq") int seq){
        boardService.deleteBoard(seq);
        return "삭제OK";
    }


}