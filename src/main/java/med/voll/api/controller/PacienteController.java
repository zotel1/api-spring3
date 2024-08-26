package med.voll.api.controller;

import med.voll.api.dto.DatosRegistroPaciente;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Repository
public class PacienteController {

    @PostMapping
    public void registrar(@RequestBody DatosRegistroPaciente datos) {
        System.out.println("datos recibidos: " + datos);
    }
}
