package cadastro;

import java.sql.ResultSet;
import java.util.ArrayList;


public class MedicoDAO extends Conexao{
    
    public String cadastrarMedico(Medico medico)
    {
        try
        { 
            String sentenca;
            
            sentenca = "INSERT INTO medico VALUES (NULL, '" + 
                    medico.getNome() + "','" + medico.getEspecialidade() + 
                    "','" + medico.getCRM() + "','" + medico.getCPF() + "')";
            
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }

    public ArrayList<Medico> listarMedico()
    {
        try
        { 
            ArrayList<Medico> medicos = new ArrayList<Medico>();
            String sentenca = "SELECT * FROM medico ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            
            while(rs.next())
            {
                Medico medico = new Medico();
                medico.setIdmedico(rs.getInt("idmedico"));
                medico.setNome(rs.getString("NOME"));
                
                medicos.add(medico);
            }
            
            return medicos;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}    
