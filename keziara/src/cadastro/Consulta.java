package cadastro;

/**
 *
 * @author Kezia
 */
public class Consulta {
    private int idconsulta;
    private int id_medico;
    private int id_paciente;
    private String convenio;

    /**
     * @return the idconsulta
     */
    public int getIdconsulta() {
        return idconsulta;
    }

    /**
     * @param idconsulta the idconsulta to set
     */
    public void setIdconsulta(int idconsulta) {
        this.idconsulta = idconsulta;
    }

    /**
     * @return the id_medico
     */
    public int getId_medico() {
        return id_medico;
    }

    /**
     * @param id_medico the id_medico to set
     */
    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    /**
     * @return the id_paciente
     * Author Kezia
     */
    public int getId_paciente() {
        return id_paciente;
    }

    /**
     * @param id_paciente the id_paciente to set
     */
    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    /**
     * @return the convenio
     */
    public String getConvenio() {
        return convenio;
    }

    /**
     * @param convenio the convenio to set
     */
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
    
}
