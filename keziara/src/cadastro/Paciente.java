package cadastro;

public class Paciente {

    private int idpaciente;
    private String Nome;
    private String CPF;
    private int idade;

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * Author: Kezia Amaral
     */
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    @Override  
   public String toString() {  
      return getNome();  
   }
}