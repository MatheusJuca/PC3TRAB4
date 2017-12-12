package br.com.prog3.trab4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req, resp);
			}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
		String matricula;String nome;String idade;String sexo;
		// Pegando os valores do form
		matricula = req.getParameter("matricula");
		nome = req.getParameter("nome");
		idade = req.getParameter("idade");
		sexo = req.getParameter("sexo");
		// Imprime dados de resposta
		out.println("<HTML><HEAD><TITLE>Resposta ao formul�rio");
		out.println("</TITLE></HEAD><BODY><CENTER>");
		out.println("<H1>Resultado do Formul�rio.</H1>");
		out.println("<BR><b>Ol� " + nome + "!Sua matr�cula �: " + matricula + "</b><BR>");
		if (sexo.equals("feminino")) {
			out.println("Voc� n�o precisa servir ao ex�rcito.");
		} else {
			if (idade.compareTo(idade) <= 18) {
				out.println("Voc� precisa servir ao ex�rcito.");
			} else {
				out.println("Voc� esta ok com as obriga��es militares.");
			}
		}
		out.println("</CENTER></BODY></HTML>");
		// Fecha o objeto
		out.close();
	}

}