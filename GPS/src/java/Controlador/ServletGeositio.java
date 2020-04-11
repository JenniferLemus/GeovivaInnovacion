/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanGeositio;
import DAO.DaoGeositio;
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
@WebServlet(name = "ServletGeositio", urlPatterns = {"/Geositio"})
public class ServletGeositio extends HttpServlet {

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
        
        int opcion=Integer.parseInt(request.getParameter("opcion"));
        String idGeositio=request.getParameter("id");
        String latitud=request.getParameter("latitud");
        String longitud=request.getParameter("longitud");
        String tipo=request.getParameter("tipo_geositio");
        String fk_geoparque=request.getParameter("fk_geoparque");
 
        
        
        BeanGeositio Bgeositio = new BeanGeositio(idGeositio, latitud, longitud, idGeositio, fk_geoparque);
        DaoGeositio Dgeositio = new DaoGeositio(Bgeositio);
        
        
        switch(opcion){
        case 1: //agregar registro
        if (Dgeositio.AgregarRegistro()) {

          request.setAttribute("exito", "<script>alert('El Geositio fue registrado correctamente')</script>");
          request.getRequestDispatcher("menusitios.jsp").forward(request, response);
        } else {
          request.setAttribute("error", "<script>alert('El Geositio no pudo ser registrado correctamente')</script>");
        }
        //para redirigir a el formulario ->""
        request.getRequestDispatcher("registrar_geositio.jsp").forward(request, response);
        break;

        case 2://   Actualizar Registro
        if (Dgeositio.ActualizarRegistro()) {
          request.setAttribute("exito", "<script>alert('El Geositio fue actualizado correctamente')</script>");
          request.getRequestDispatcher("vista_geositio.jsp").forward(request, response);

        } else {
          request.setAttribute("error", "<script>alert('El Geositio no pudo ser actualizado correctamente intentelo de nuevo')</script>");
          request.getRequestDispatcher("vista_geositio.jsp").forward(request, response);
        }
        request.getRequestDispatcher("actualizar_Geositio.jsp").forward(request, response);
        break;
        
          case 3 : //Consulta actualizacion 
              BeanGeositio BGe = DaoGeositio.consultaporidentificador(idGeositio);
              if (BGe != null) {
                  
                  request.setAttribute("bGeositio", BGe);
                  request.getRequestDispatcher("actualizar_Geositio.jsp").forward(request, response);
                  
              }else{
              request.setAttribute("error","<script>alert('El Geositio no se encontro')</script>");
              request.getRequestDispatcher("vista_geositio.jsp").forward(request, response);
                  
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
