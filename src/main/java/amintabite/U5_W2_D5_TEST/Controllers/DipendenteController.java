package amintabite.U5_W2_D5_TEST.Controllers;

import amintabite.U5_W2_D5_TEST.Entities.Dipendente;
import amintabite.U5_W2_D5_TEST.Payloads.DipendentePayload;
import amintabite.U5_W2_D5_TEST.Services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;


    @GetMapping
    public Page<Dipendente> getDipendenti(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue ="4" ) int size,
            @RequestParam(defaultValue = "nome") String sortBy)
            {
    return dipendenteService.FindAll(page, size, sortBy);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dipendente createDipendente(@RequestBody DipendentePayload body){

                return dipendenteService.saveDip(body);
    }


        @GetMapping("/{iddipendente}")

     public Dipendente getDipendenteById(@PathVariable long iddipendente){
                return dipendenteService.findById(iddipendente);
        }


    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDipendente(@PathVariable long iddipendente){
                dipendenteService.findByIdAndDelete(iddipendente);

    }




}
