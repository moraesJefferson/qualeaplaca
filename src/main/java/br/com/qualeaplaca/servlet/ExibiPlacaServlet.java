package br.com.qualeaplaca.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.qualeaplaca.model.Foto;

@WebServlet("/exibiPlaca")
public class ExibiPlacaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		List<Foto> listaFotos = new ArrayList<Foto>();
		listaFotos = (List<Foto>) sessao.getAttribute("listaFotos");
			
		request.setAttribute("listaFotos", listaFotos);
		RequestDispatcher rd = request.getRequestDispatcher("/resource/html/exibir.jsp");
		rd.forward(request, response);
	}

}
