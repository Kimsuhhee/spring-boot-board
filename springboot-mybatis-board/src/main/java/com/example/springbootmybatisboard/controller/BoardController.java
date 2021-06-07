package com.example.springbootmybatisboard.controller;

import com.example.springbootmybatisboard.dto.BoardDto;
import com.example.springbootmybatisboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping
    public String BoardList(Model model) {
        List<BoardDto> list = boardService.getBoardList();
        model.addAttribute("list",list);
        return "list";
    }

    @GetMapping("/{boardSeq}")
    public String Board(@PathVariable("boardSeq") int num, Model model){
        boardService.updateReads(num);
        BoardDto board = boardService.getBoard(num);
        model.addAttribute("board",board);
        return "boardDetail";
    }
    @GetMapping("/add")
    public String addForm(){
        return "newBoard";
    }

    @PostMapping
    public String insertBoard(BoardDto boardDto){
        boardService.insertBoard(boardDto);
        return "redirect:/board";
    }

    @GetMapping("/update/{boardSeq}")
    public String updateForm(@PathVariable("boardSeq") int seq, Model model){
        BoardDto board = boardService.getBoard(seq);
        model.addAttribute("board",board);
        return "updateBoard";
    }

    @PutMapping("/{boardSeq}")
    public String update(@PathVariable("boardSeq") int seq, @ModelAttribute("form") BoardDto boardDto){
        boardService.updateBoard(boardDto);
        return "redirect:/board";
    }

    @DeleteMapping("/{boardSeq}")
    public String deleteBoard(@PathVariable("boardSeq") int seq){
        boardService.deleteBoard(seq);
        return "redirect:/board";
    }

}
