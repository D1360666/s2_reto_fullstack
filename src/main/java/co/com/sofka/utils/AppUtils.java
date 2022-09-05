package co.com.sofka.utils;



import co.com.sofka.dto.CardDto;
import co.com.sofka.dto.GameDto;
import co.com.sofka.dto.PlayerDto;
import co.com.sofka.model.Card;
import co.com.sofka.model.Game;
import co.com.sofka.model.Player;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    //Modelo de cambiar DTO a Entity y viceversa
    public static CardDto cardEntityToDto(Card card){
        CardDto CardDto= new CardDto();
        BeanUtils.copyProperties(card, CardDto);
        return CardDto;
    }


    public static Card cardDtoToEntity(CardDto cardDto){
        Card card= new Card();
        BeanUtils.copyProperties(cardDto,card);
        return card;
    }
    public static GameDto gameEntityToDto(Game game){
        GameDto gameDto= new GameDto();
        BeanUtils.copyProperties(game, gameDto);
        return gameDto;
    }

    public static Game gameDtoToEntity(GameDto gameDto){
        Game game= new Game();
        BeanUtils.copyProperties(gameDto,game);
        return game;
    }

    public static PlayerDto playerEntityToDto(Player player){
        PlayerDto playerDto= new PlayerDto();
        BeanUtils.copyProperties(player, playerDto);
        return playerDto;
    }

    public static Player playerDtoToEntity(PlayerDto playerDto){
        Player player= new Player();
        BeanUtils.copyProperties(playerDto,player);
        return player;
    }
}
