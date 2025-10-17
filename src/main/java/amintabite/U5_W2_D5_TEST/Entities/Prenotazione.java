package amintabite.U5_W2_D5_TEST.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprenotazione;

    private LocalDate datarichiesta;

    private String noteextra;


    public Prenotazione( LocalDate datarichiesta, String noteextra) {
        this.datarichiesta = datarichiesta;
        this.noteextra = noteextra;
    }
}
