package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.consulta.DatosAgendarConsulta;

public class PacienteActivo {

    private PacienteRepository repository;

    public void validar(DatosAgendarConsulta datos) {
        if (datos.idPaciente() == null()) {
            return;
        }


    }
}
