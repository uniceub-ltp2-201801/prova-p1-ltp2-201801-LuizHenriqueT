package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Professor;

public class ProfessorDAO {
	
	private Connection conexao;
	
	
	public ProfessorDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	public ArrayList<Professor> listarProfessores() {
		
		ArrayList<Professor> professores = new ArrayList<Professor>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
		
			ps = conexao.prepareStatement("SELECT * FROM professor");
		
			rs = ps.executeQuery();
		
			while(rs.next()) {
				
				professores.add(new Professor(rs.getInt("idProfessor"), rs.getString("Nome")));	
				
			}
			
			
			rs.close();
			ps.close();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return professores;
		
		
		
		
	}
	

}
		
		
		
			
		
