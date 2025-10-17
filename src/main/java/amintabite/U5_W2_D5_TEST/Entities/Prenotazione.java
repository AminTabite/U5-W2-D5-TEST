package amintabite.U5_W2_D5_TEST.Entities;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendente dipendente;

    @ManyToOne
    @JoinColumn(name = "viaggio_id")
    private Viaggio viaggio;


    public Prenotazione( LocalDate datarichiesta, String noteextra) {
        this.datarichiesta = datarichiesta;
        this.noteextra = noteextra;
    }
}
