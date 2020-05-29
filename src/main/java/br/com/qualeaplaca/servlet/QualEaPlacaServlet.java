package br.com.qualeaplaca.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.qualeaplaca.dto.FotoDto;
import br.com.qualeaplaca.gateway.QualEaPlacaGateway;
import br.com.qualeaplaca.model.Foto;

@WebServlet("/buscaPlaca")
public class QualEaPlacaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FotoDto fotoDto = new FotoDto();
		Foto foto = new Foto();
		QualEaPlacaGateway gateway = QualEaPlacaGateway.newInstance();
		
		String img = request.getParameter("imagem");
		fotoDto.setFoto(img.replaceAll("data:image/jpeg;base64,", ""));	
		foto = gateway.buscaPlaca(fotoDto);
		foto.setFoto("data:image/jpeg;base64,"+foto.getFoto());
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("foto",foto);
		response.sendRedirect("exibiPlaca");
	}

}
