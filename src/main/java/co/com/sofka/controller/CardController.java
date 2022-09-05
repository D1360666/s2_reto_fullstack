package co.com.sofka.controller;

import co.com.sofka.dto.CardDto;
import co.com.sofka.dto.GameDto;
import co.com.sofka.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cards")
@CrossOrigin(origins = "http://localhost:4200")
public class CardController {
    @Autowired
    private CardService service;

    @GetMapping
    public Flux<CardDto> getCards(){return service.getCards();}

    @PostMapping
    public Mono<CardDto> saveCard(@RequestBody Mono<CardDto> cardDtoMono){
        return service.saveCard(cardDtoMono);
    }
}
