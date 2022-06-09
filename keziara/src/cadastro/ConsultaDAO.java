package cadastro;

import java.sql.ResultSet;
import java.util.ArrayList;


public class ConsultaDAO extends Conexao{
    
    public String cadastrarConsulta(Consulta consulta)
    {
        try
        { 
            String sentenca;
            
            sentenca = "INSERT INTO consulta VALUES (NULL, '" + 
                    consulta.getId_medico() + "','" + consulta.getId_paciente() + 
                    "','" + consulta.getConvenio() + "')";
            
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public ArrayList listarConsulta()
    {
        try
        { 
            ArrayList consultas = new ArrayList();
            String sentenca = "SELECT * FROM consultas ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            
            while(rs.next())
            {
                Consulta consulta = new Consulta();
                consulta.setIdconsulta(rs.getInt("idConsulta"));
                consulta.setId_medico(rs.getInt("id_medico"));
                consulta.setId_paciente(rs.getInt("id_paciente"));
                consulta.setConvenio(rs.getString("convenio"));
                
                consultas.add(consulta);
            }
            
            return consultas;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}    
