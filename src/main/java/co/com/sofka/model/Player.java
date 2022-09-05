package co.com.sofka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Players")
public class Player {
    @Id
    private String idPlayer;
    private String user;

}
