package amintabite.U5_W2_D5_TEST.Entities;

import amintabite.U5_W2_D5_TEST.StatoViaggio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Viaggio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idviaggio;

    private String destinazione;

    private LocalDate dataviaggio;

    private StatoViaggio statoViaggio;
    @OneToMany
    @JoinColumn(name = "Viaggio_id")
    private List<Prenotazione> prenotazioni;





    public Viaggio( String destinazione,LocalDate dataviaggio, StatoViaggio statoViaggio) {

        this.destinazione = destinazione;
        this.dataviaggio = dataviaggio;
        this.statoViaggio = statoViaggio;

    }
}
