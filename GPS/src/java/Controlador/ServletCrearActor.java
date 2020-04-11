/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanCrearActor;
import DAO.DaoCrearActor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SENA
 */
@WebServlet(name = "ServletCrearAcotr", urlPatterns = {"/CrearActor"})
public class ServletCrearActor extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    int opcion = Integer.parseInt(request.getParameter("opcion"));

    String Nombres = request.getParameter("Nombres");
    String Tipo = request.getParameter("Tipo");
    String Apellidos = request.getParameter("Apellidos");
    String Telefono = request.getParameter("Telefono");
    String Poblacion = request.getParameter("Poblacion");
    String actor = request.getParameter("actor");
    String NumeroIdentifacion = request.getParameter("NumeroIdentifacion");

    BeanCrearActor Bc = new BeanCrearActor(actor, NumeroIdentifacion, Tipo, Nombres, Apellidos, Telefono, Poblacion);
    DaoCrearActor DC = new DaoCrearActor(Bc);

    switch (opcion) {
      case 1: //agregar registro
        if (DC.AgregarRegistro()) {

          request.setAttribute("exito", "<script>alert('El Actor fue registrado correctamente')</script>");
        } else {
          request.setAttribute("error", "<script>alert('El Actor no pudo ser registrado correctamente')</script>");
        }
        //para redirigir a el formulario ->""
        request.getRequestDispatcher("registrar_actor.jsp").forward(request, response);
        break;

    }

  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
