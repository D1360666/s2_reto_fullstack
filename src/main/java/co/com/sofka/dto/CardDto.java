package co.com.sofka.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {
    private String idCard;
    private String uri;
    private String nombre;
    private String poder;

    /*public CardDto() {
    }

    public CardDto(String _id, String uri, String nombre, String poder) {
        this._id = _id;
        this.uri = uri;
        this.nombre = nombre;
        this.poder = poder;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }*/
}
