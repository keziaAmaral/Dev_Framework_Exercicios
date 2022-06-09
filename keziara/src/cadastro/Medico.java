package cadastro;


public class Medico {
    private int idmedico;
    private String Nome;
    private int especialidade;
    private int CRM;
    private String CPF;

    /**
     * @return the idmedico
     */
    public int getIdmedico() {
        return idmedico;
    }

    /**
     * @param idmedico the idmedico to set
     */
    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     * Author Kezia
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the especialidade
     */
    public int getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the CRM
     */
    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
   @Override  
   public String toString() {  
      return getNome();  
   }
}
