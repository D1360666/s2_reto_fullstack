package co.com.sofka.services;

import co.com.sofka.dto.CardDto;
import co.com.sofka.dto.GameDto;
import co.com.sofka.repository.CardRepository;
import co.com.sofka.repository.GameRepository;
import co.com.sofka.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CardService {
    @Autowired
    private CardRepository repo;

    public Flux<CardDto> getCards(){return repo.findAll().map(AppUtils::cardEntityToDto);}

    public Mono<CardDto> saveCard(Mono<CardDto> cardDtoMono) {
        return cardDtoMono.map(AppUtils::cardDtoToEntity)
                .flatMap(repo::insert)
                .map(AppUtils::cardEntityToDto);
    }

}
