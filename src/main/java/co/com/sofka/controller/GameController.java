package co.com.sofka.controller;

import co.com.sofka.dto.GameDto;
import co.com.sofka.dto.PlayerDto;
import co.com.sofka.model.Game;
import co.com.sofka.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/games")
@CrossOrigin(origins = "http://localhost:4200")
public class GameController {

    @Autowired
    private GameService service;

    //Return all Games to List
    @GetMapping
    public Flux<GameDto> getGames(){return service.getGames();}

    //Return active games that you can enjoy to play
   @GetMapping(value = "/activegames")
    public Flux<GameDto> getActiveGames(){return service.getActiveGames();}

    @PostMapping
    public Mono<GameDto> saveGame(@RequestBody Mono<GameDto> gameDtoMono){
        return service.saveGame(gameDtoMono);
    }

    @PutMapping
    public Mono<GameDto> updateGame(@RequestBody Mono<GameDto> gameDtoMono, @PathVariable String id){

        return service.updateGame(gameDtoMono, id);
    }



}

