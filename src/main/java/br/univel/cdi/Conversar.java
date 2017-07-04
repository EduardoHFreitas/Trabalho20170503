package br.univel.cdi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.beans.Comprimentar;
import br.univel.beans.Despedir;
import br.univel.cdi.dao.FinalizarConversa;
import br.univel.cdi.dao.IniciarConversa;

@WebServlet("/Conversar")
public class Conversar extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	@Comprimentar
	@Named("iniciarConversa")
	IniciarConversa iniciar;

	@Inject
	@Despedir
	@Named("finalizarConversa")
	FinalizarConversa finalizar;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();

		writer.println(iniciar.conversar());

		writer.println(finalizar.conversar());
	}
}
