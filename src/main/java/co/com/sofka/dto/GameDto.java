package co.com.sofka.dto;

import co.com.sofka.model.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GameDto {
    private String idGame;
    private String nombre;
    private String estado;
    //private Set<PlayerDto> players;
  /*  public GameDto() {

    }

    public GameDto(String idGame, String nombre, String estado) {
        this.idGame = idGame;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getIdGame() {
        return idGame;
    }

    public void setIdGame(String idGame) {
        this.idGame = idGame;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        estado = estado;
    }
*/

}
