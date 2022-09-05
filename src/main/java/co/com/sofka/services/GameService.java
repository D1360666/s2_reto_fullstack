package co.com.sofka.services;

import co.com.sofka.dto.GameDto;
import co.com.sofka.repository.GameRepository;
import co.com.sofka.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GameService {
    @Autowired
    private GameRepository repo;

    public Flux<GameDto> getGames(){return repo.findAll().map(AppUtils::gameEntityToDto);}

    public Mono<GameDto> saveGame(Mono<GameDto> gameDtoMono) {
        return gameDtoMono.map(AppUtils::gameDtoToEntity)
                .flatMap(repo::insert)
                .map(AppUtils::gameEntityToDto);
    }

    public Mono updateGame(Mono<GameDto> gameDtoMono, String id){
        return repo.findById(id)
                .flatMap(p -> gameDtoMono.map(AppUtils::gameDtoToEntity)
                        .doOnNext(e->e.setIdGame(id)))
                .flatMap(repo::save)
                .map(AppUtils::gameEntityToDto);
    }

    //filter by active games to enjoy
    public Flux<GameDto> getActiveGames() {
        return repo.findAll().map(AppUtils::gameEntityToDto)
                .filter(e -> e.getEstado().equals("Activo"));
    }


}
