package br.com.qualeaplaca.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.qualeaplaca.gateway.QualEaPlacaGateway;
import br.com.qualeaplaca.model.Foto;

@WebServlet("/buscaPlaca")
public class BuscaPlacaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3535096411477749375L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Foto> listaFotos = new ArrayList<Foto>();
		QualEaPlacaGateway gateway = QualEaPlacaGateway.newInstance();
		listaFotos = gateway.buscaPlaca();
		
		for(Foto foto : listaFotos) {
			System.out.println(foto.getFoto());
			System.out.println(foto.getPlaca());
		}
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("listaFotos",listaFotos);
		
		response.sendRedirect("exibiPlaca");
	}

}