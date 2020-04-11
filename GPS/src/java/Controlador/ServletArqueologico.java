/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanArqueologico;
import DAO.DaoArqueologico;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aprendiz
 */
@WebServlet(name = "ServletArqueologico", urlPatterns = {"/Arqueologico"})
public class ServletArqueologico extends HttpServlet {

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
        String id_arqueologico = request.getParameter("id_arqueologico");
        String nombre = request.getParameter("nombre");
        String ubicacion = request.getParameter("ubicacion");
        String cultura = request.getParameter("cultura");
        String formacion = request.getParameter("formacion");
        String cronologico = request.getParameter("cronologico");
        String funcional = request.getParameter("funcional");
        String tipologia = request.getParameter("tipologia");
        String duracion = request.getParameter("duracion");
        String fk_era = request.getParameter("foranea_era");
        String fk_periodo = request.getParameter("foranea_periodo");

        BeanArqueologico Bar = new BeanArqueologico(id_arqueologico, nombre, ubicacion, cultura, formacion, cronologico, funcional, tipologia, duracion, fk_era, fk_periodo);
        DaoArqueologico Dar = new DaoArqueologico(Bar);
        switch (opcion) {

            case 1://   Agregar Registro
                if (Dar.AgregarRegistro()) {
                    request.setAttribute("exito", "<script>alert('El Geositio fue creado correctamente')</script>");

                } else {
                    request.setAttribute("error", "<script>alert('El Geositio no pudo ser registrado correctamente')</script>");
                }
                request.getRequestDispatcher("Arqueologico.jsp").forward(request, response);
                break;

            case 2://   Actualizar Registro
                if (Dar.ActualizarRegistro()) {
                    request.setAttribute("exito", "<script>alert('El Geositio fue actualizado correctamente')</script>");
                    request.getRequestDispatcher("Vista_Arqueologico.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", "<script>alert('El Geositio no pudo ser actualizado correctamente Intententelo de nuevo')</script>");
                    request.getRequestDispatcher("Vista_Arqueologico.jsp").forward(request, response);
                }
                request.getRequestDispatcher("actualizar_Arqueologico.jsp").forward(request, response);
                break;

            case 3: //Consulta actualizacion 
                BeanArqueologico BAr = DaoArqueologico.consultaporidentificador(id_arqueologico);
                if (BAr != null) {

                    request.setAttribute("bArqueologico", BAr);
                    request.getRequestDispatcher("actualizar_Arqueologico.jsp").forward(request, response);

                } else {
                    request.setAttribute("error", "<script>alert('El yacimiento arqueologico no se encontro')</script>");
                    request.getRequestDispatcher("Vista_Arqueologico.jsp").forward(request, response);

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
