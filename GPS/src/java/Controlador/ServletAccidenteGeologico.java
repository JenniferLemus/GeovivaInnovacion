/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanYacimientoGeologico;
import DAO.DaoYacimientoGeologico;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "ServletAccidenteGeologico", urlPatterns = {"/AccidenteGeologico"})
public class ServletAccidenteGeologico extends HttpServlet {

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
    String id_Geologico = request.getParameter("id_Geologico");
    String nombre = request.getParameter("nombre");
    String ubicacion = request.getParameter("ubicacion");
    String elevacion = request.getParameter("elevacion");
    String pendiente = request.getParameter("pendiente");
    String orientacion = request.getParameter("orientacion");
    String estratificacion = request.getParameter("estratificacion");
    String formacion_rocosa = request.getParameter("formacion_rocosa");
    String tipo_suelo = request.getParameter("tipo_suelo");
    String fk_era = request.getParameter("fk_era");
    String fk_periodo = request.getParameter("fk_periodo");

    BeanYacimientoGeologico Baccidente = new BeanYacimientoGeologico(id_Geologico, nombre, ubicacion, elevacion, pendiente, orientacion, estratificacion, formacion_rocosa, tipo_suelo, fk_era, fk_periodo);
    DaoYacimientoGeologico Daccidente = new DaoYacimientoGeologico(Baccidente);

    switch (opcion) {

      case 1://   Agregar Registro
        if (Daccidente.AgregarRegistro()) {
          request.setAttribute("exito", "<script>Swal.fire('El Geositio fue creado correctamente')</script>");

        } else {
          request.setAttribute("error", "<script>Swal.fire('El Geositio no pudo ser registrado correctamente')</script>");
        }
        request.getRequestDispatcher("crear_geoparque.jsp").forward(request, response);
        break;

      case 2://   Actualizar Registro
        if (Daccidente.ActualizarRegistro()) {
          request.setAttribute("exito", "<script>Swal.fire('El Geositio fue actualizado correctamente')</script>");
          request.getRequestDispatcher("Vista_Geologico.jsp").forward(request, response);
        } else {
          request.setAttribute("error", "<script>Swal.fire('El Geositio no pudo ser actualizado correctamente intentelo de nuevo')</script>");
          request.getRequestDispatcher("Vista_Geologico.jsp").forward(request, response);
        }
        request.getRequestDispatcher("actualizar_Geologico.jsp").forward(request, response);
        break;

      case 3: //Consulta actualizacion 
        BeanYacimientoGeologico BYa = DaoYacimientoGeologico.consultaporidentificador(id_Geologico);
        if (BYa != null) {

          request.setAttribute("bGeologico", BYa);
          request.getRequestDispatcher("actualizar_Geologico.jsp").forward(request, response);

        } else {
          request.setAttribute("error", "<script>Swal.fire('El yacimiento Geologico no se encontro')</script>");
          request.getRequestDispatcher("Vista_Geologico.jsp").forward(request, response);

        }
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
