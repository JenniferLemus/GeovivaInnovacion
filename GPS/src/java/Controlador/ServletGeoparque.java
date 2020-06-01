/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanGeoparque;
import DAO.DaoGeoparque;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jennifer
 */
@WebServlet(name = "ServletGeoparque", urlPatterns = {"/Geoparque"})
public class ServletGeoparque extends HttpServlet {

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
       String id_geoparque = request.getParameter("id_geoparque");
    String nombre = request.getParameter("nombre");
    String latitud = request.getParameter("latitud");
    String longitud = request.getParameter("longitud");
    String Pais = request.getParameter("Pais");
    String temperatura = request.getParameter("temperatura");
    String piso_Termico = request.getParameter("piso_termico");
    String fecha_registro = request.getParameter("fecha_registro");
    String fk_geologo = request.getParameter("geologo");

    BeanGeoparque Bgeoparque = new BeanGeoparque(id_geoparque, nombre, latitud, longitud, Pais, temperatura, piso_Termico, fecha_registro, fk_geologo);
    DaoGeoparque Dgeoparque = new DaoGeoparque(Bgeoparque);

    switch (opcion) {

      case 1://   Agregar Registro
        if (Dgeoparque.AgregarRegistro()) {
          request.setAttribute("exito", "<script>Swal.fire('El Geoparque fue creado correctamente')</script>");
          request.getRequestDispatcher("Guardabosques.jsp").forward(request, response);

        } else {
          request.setAttribute("error", "<script>Swal.fire('El Geoparque no pudo ser registrado correctamente')</script>");
        }
        request.getRequestDispatcher("crear_geoparque.jsp").forward(request, response);
        break;
 case 2://   Actualizar Registro
        if (Dgeoparque.ActualizarRegistro()) {
          request.setAttribute("exito", "<script>Swal.fire('El Geoparque fue actualizado correctamente')</script>");
           request.getRequestDispatcher("vista_Geoparque.jsp").forward(request, response);

        } else {
          request.setAttribute("error", "<script>Swal.fire('El Geoparque no pudo ser actualizado correctamente')</script>");
        }
        request.getRequestDispatcher("actualizar_geoparque.jsp").forward(request, response);
        break;
        
          case 3 : //Consulta actualizacion 
              BeanGeoparque BGe = DaoGeoparque.consultaporidentificador(id_geoparque);
              if (BGe != null) {
                  
                  request.setAttribute("bGeoparque", BGe);
                  request.getRequestDispatcher("actualizar_geoparque.jsp").forward(request, response);
                  
              }else{
              request.setAttribute("error","<script>Swal.fire('El Geoparque no se encontro')</script>");
              request.getRequestDispatcher("Vista_geoparque.jsp").forward(request, response);
                  
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
