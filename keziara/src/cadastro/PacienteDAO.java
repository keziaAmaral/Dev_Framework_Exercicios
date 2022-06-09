package cadastro;

import java.sql.ResultSet;
import java.util.ArrayList;


public class PacienteDAO extends Conexao{
    
    public String cadastrarPaciente(Paciente paciente)
    {
        try
        { 
            String sentenca;
            
            sentenca = "INSERT INTO paciente VALUES (NULL, '" + 
                    paciente.getNome() + "','" + paciente.getCPF() + 
                    "','" + paciente.getIdade() + "')";
            
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }

    public ArrayList<Paciente> listarPacientes()
    {
        try
        { 
            ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
            String sentenca = "SELECT * FROM paciente ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            
            while(rs.next())
            {
                Paciente paciente = new Paciente();
                paciente.setIdpaciente(rs.getInt("idpaciente"));
                paciente.setNome(rs.getString("NOME"));
                
                pacientes.add(paciente);
            }
            
            return pacientes;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
