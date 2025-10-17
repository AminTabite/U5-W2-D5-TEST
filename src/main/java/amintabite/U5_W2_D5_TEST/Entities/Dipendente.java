package amintabite.U5_W2_D5_TEST.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Dipendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddipendente;
    private String username;
    private String nome;
    private String cognome;
    private  String email;


    public Dipendente(String username ,String nome, String cognome, String email) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
}
