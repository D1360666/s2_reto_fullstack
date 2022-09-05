package co.com.sofka.dto;

import java.util.Map;
import java.util.Set;

public class TableDto {
    private int idTablero;
    private Map<PlayerDto, Set<CardDto>> partida;


    public int getIdTablero() {
        return idTablero;
    }


    //Agregando jugadores
    public void addPlayer(PlayerDto playerDto, Set<CardDto> cardDtos){
        this.partida.put(playerDto, cardDtos);
    }
    public void setIdTablero(int idTablero) {
        this.idTablero = idTablero;
    }

    public Map<PlayerDto, Set<CardDto>> getPartida() {
        return partida;
    }

    public void setPartida(Map<PlayerDto, Set<CardDto>> partida) {
        this.partida = partida;
    }
}
