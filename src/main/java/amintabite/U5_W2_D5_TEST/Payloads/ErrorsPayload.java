package amintabite.U5_W2_D5_TEST.Payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor

public class ErrorsPayload {

        private String messaggio;
        private LocalDateTime oraevento;




}
