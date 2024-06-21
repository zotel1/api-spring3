package med.voll.api.domain.consulta;

import med.voll.api.domain.medico.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaDeConsultaService {

    @Autowired
    private  ConsultaRepository consultaRepository;

    public void agendar(DatosAgendarConsulta datos) {

        var paciente = pacienteRepository.findById(datos.idPaciente()).get();

        var medico = medicoRepository.findById(datos.idMedico()).get();

        var consulta = new Consulta(null, new Medico(),new Paciente(), datos.fecha());
        consultaRepository.save(consulta);
    }
}
