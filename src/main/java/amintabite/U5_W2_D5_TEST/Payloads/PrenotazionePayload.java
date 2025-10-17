package amintabite.U5_W2_D5_TEST.Payloads;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString

public class PrenotazionePayload {


    private LocalDate datarichiesta;

    private String noteextra;

    public PrenotazionePayload(LocalDate datarichiesta, String noteextra) {
        this.datarichiesta = datarichiesta;
        this.noteextra = noteextra;
    }
}
