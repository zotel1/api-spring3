package med.voll.api.domain.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.DatosAgendarConsulta;
import med.voll.api.domain.paciente.PacienteRepository;

public class PacienteActivo implements ValidadorDeConsultas{

    private PacienteRepository repository;

    public void validar(DatosAgendarConsulta datos) {
        if (datos.idPaciente() == null) {
            return;
        }

        var pacienteActivo = repository.findActivoById(datos.idPaciente());

        if (!pacienteActivo) {
            throw new ValidationException("No se pueden permitir agendar citas con pacientes inactivos en el sistema");
        }
    }
}
