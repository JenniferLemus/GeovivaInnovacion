/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanFlora;
import DAO.DaoFlora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cotrof
 */
@WebServlet(name = "ServletFlora", urlPatterns = {"/Flora"})
public class ServletFlora extends HttpServlet {

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
    String id_flora = request.getParameter("id_flora");
    String tipo = request.getParameter("tipo");
    String numeroIndividuos = request.getParameter("numeroIndividuos");
    String tamano = request.getParameter("tamano");
    String fk_geositio = request.getParameter("fk_geositio");
    String fk_guardabosques = request.getParameter("fk_guardabosques");
    
    BeanFlora Bflora = new BeanFlora(id_flora, tipo, numeroIndividuos, tamano, fk_geositio, fk_guardabosques);
    DaoFlora Dflora= new DaoFlora(Bflora);
        switch (opcion) {

      case 1://   Agregar Registro
        if (Dflora.AgregarRegistro()) {
          request.setAttribute("exito", "<script>Swal.fire('La flora fue creada correctamente')</script>");

        } else {
          request.setAttribute("error", "<script>Swal.fire('La flora no pudo ser registrada correctamente')</script>");
        }
        request.getRequestDispatcher("registrar_flora.jsp").forward(request, response);
        break;

        
            case 2://   Actualizar Registro
        if (Dflora.ActualizarRegistro()) {
          request.setAttribute("exito", "<script>Swal.fire('La Flora fue actualizada correctamente')</script>");
          request.getRequestDispatcher("vista_flora.jsp").forward(request, response);

        } else {
          request.setAttribute("error", "<script>Swal.fire('La Flora no pudo ser actualizado correctamente')</script>");
        }
        request.getRequestDispatcher("actualizar_flora.jsp").forward(request, response);
        
        
        break;
        
          case 3 : //Consulta actualizacion 
              BeanFlora BFlo = DaoFlora.consultaporidentificador(id_flora);
              if (BFlo != null) {
                  
                  request.setAttribute("bFlora", BFlo);
                  request.getRequestDispatcher("actualizar_flora.jsp").forward(request, response);
                  
              }else{
              request.setAttribute("error","<script>Swal.fire('El yacimiento arqueologico no se encontro')</script>");
              request.getRequestDispatcher("vista_flora.jsp").forward(request, response);
                  
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
