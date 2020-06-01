/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanPaleontologico;
import DAO.DaoPaleontologico;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Userdata11
 */
@WebServlet(name = "ServletPaleontologico", urlPatterns = {"/Paleontologico"})
public class ServletPaleontologico extends HttpServlet {

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
         String id_paleontologico = request.getParameter("id_paleontologico");
         String nombre = request.getParameter("nombre");
         String localidad = request.getParameter("localidad");
         String capas = request.getParameter("capas");
         String fosiles =request.getParameter("fosiles");
         String tipo_roca = request.getParameter("tipo_roca");
         String tipo = request.getParameter("tipo");
         String fk_era = request.getParameter("fk_era");
         String fk_periodo = request.getParameter("fk_periodo");
         
         BeanPaleontologico Bpaleontologico = new BeanPaleontologico(id_paleontologico, nombre, localidad, capas, fosiles, tipo_roca, tipo, fk_era, fk_periodo);
        DaoPaleontologico Dpaleontologico = new DaoPaleontologico(Bpaleontologico);
        
        switch (opcion){
            case 1:
                if (Dpaleontologico.AgregarRegistro()){
                request.setAttribute("exito", "<script>Swal.fire('El Geositio fue creado correctamente')</script>");
                } else {
                request.setAttribute("error", "<script>Swal.fire('El Geositio no pudo ser registrado correctamente')</script>");
                }
                
                request.getRequestDispatcher("Paleontologico.jsp").forward(request, response);
        
                break;
        case 2://   Actualizar Registro
        if (Dpaleontologico.ActualizarRegistro()) {
          request.setAttribute("exito", "<script>Swal.fire('El Geositio fue actualizado correctamente')</script>");
          request.getRequestDispatcher("vista_paleontologico.jsp").forward(request, response);

        } else {
          request.setAttribute("error", "<script>Swal.fire('El Geositio no pudo ser actualizado correctamente intentelo de nuevo')</script>");
          request.getRequestDispatcher("vista_paleontologico.jsp").forward(request, response);
        }
        request.getRequestDispatcher("actualizar_paleontologico.jsp").forward(request, response);
        break;
        
          case 3 : //Consulta actualizacion 
              BeanPaleontologico BPa = DaoPaleontologico.consultaporidentificador(id_paleontologico);
              if (BPa != null) {
                  
                  request.setAttribute("bPaleontologico", BPa);
                  request.getRequestDispatcher("actualizar_paleontologico.jsp").forward(request, response);
                  
              }else{
              request.setAttribute("error","<script>Swal.fire('El yacimiento Paleontologico no se encontro')</script>");
              request.getRequestDispatcher("vista_paleontologico.jsp").forward(request, response);
                  
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
