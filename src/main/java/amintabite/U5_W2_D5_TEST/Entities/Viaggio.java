package amintabite.U5_W2_D5_TEST.Entities;

import amintabite.U5_W2_D5_TEST.StatoViaggio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Viaggio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idviaggio;

    private LocalDate dataviaggio;

    private StatoViaggio statoViaggio;





    public Viaggio(LocalDate dataviaggio, StatoViaggio statoViaggio) {

        this.dataviaggio = dataviaggio;
        this.statoViaggio = statoViaggio;

    }
}
