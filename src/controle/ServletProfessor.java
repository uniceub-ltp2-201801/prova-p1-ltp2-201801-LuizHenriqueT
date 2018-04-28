package controle;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDAO;
import model.Professor;

/**
 * Servlet implementation class ServletProfessor
 */
@WebServlet("/ServletProfessor")
public class ServletProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProfessor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection conexao = Conexao.getConexao();
				
		ProfessorDAO pd = new ProfessorDAO(conexao);
		
		ArrayList<Professor> professores = pd.listarProfessores();
		
		request.setAttribute("professores", professores);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarProfessores.jsp");
		rd.forward(request, response);
		
		
		
		
	}

	
}
