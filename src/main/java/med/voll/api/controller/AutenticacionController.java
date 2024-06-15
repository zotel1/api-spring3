package med.voll.api.controller;


import jakarta.validation.Valid;
import med.voll.api.domain.usuarios.DatosAutenticacion;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity realizarLogin(@RequestBody @Valid DatosAutenticacion datos) {

        var token = new UsernamePasswordAuthenticationToken(datos.login(), datos.contrasena());
        var authenticacion = manager.authenticate(token);
        return ResponseEntity.ok().build();
    }

}
