package com.devsuperior.dslist.controllers;


import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    @Transactional(readOnly = true)
    public List<GameListDTO> findAllGameList(){
        List<GameListDTO> result = gameListService.findAllGameList();
        return result;
    }


}
