package co.com.sofka.model;

import java.util.Map;
import java.util.Set;

public class Table {
    private int idTablero;
    private Map<Player, Set<Card>> partida;


    public int getIdTablero() {
        return idTablero;
    }


    //Agregando jugadores
    public void addPlayer(Player playerDto, Set<Card> cardDtos){
        this.partida.put(playerDto, cardDtos);
    }
    public void setIdTablero(int idTablero) {
        this.idTablero = idTablero;
    }

    public Map<Player, Set<Card>> getPartida() {
        return partida;
    }

    public void setPartida(Map<Player, Set<Card>> partida) {
        this.partida = partida;
    }
}
