/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanFauna;
import DAO.DaoFauna;
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
@WebServlet(name = "ServletFauna", urlPatterns = {"/Fauna"})
public class ServletFauna extends HttpServlet {

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
        String id_fauna = request.getParameter("id_fauna");
        String especie = request.getParameter("especie");
        String Ecosistema = request.getParameter("Ecosistema");
        String habitat = request.getParameter("habitat");
        String tipo = request.getParameter("tipo");
        String fk_geositio = request.getParameter("fk_geositio");
        String fk_guardabosques = request.getParameter("fk_guardabosques");

        BeanFauna Bfauna = new BeanFauna(id_fauna, especie, Ecosistema, habitat, tipo, fk_geositio, fk_guardabosques);
        DaoFauna Dfauna = new DaoFauna(Bfauna);
        switch (opcion) {

            case 1://   Agregar Registro
                if (Dfauna.AgregarRegistro()) {
                    request.setAttribute("exito", "<script>Swal.fire('La fauna fue creada correctamente')</script>");

                } else {
                    request.setAttribute("error", "<script>Swal.fire('La fauna no pudo ser registrada correctamente')</script>");
                }
                request.getRequestDispatcher("registrar_fauna.jsp").forward(request, response);
                break;

            case 2://   Actualizar Registro
                if (Dfauna.ActualizarRegistro()) {
                    request.setAttribute("exito", "<script>Swal.fire('El Geositio fue actualizado correctamente')</script>");
                    request.getRequestDispatcher("vista_fauna.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", "<script>Swal.fire('El Geositio no pudo ser actualizado correctamente intentelo de nuevo')</script>");
                    request.getRequestDispatcher("vista_fauna.jsp").forward(request, response);
                }
                request.getRequestDispatcher("actualizar_Fauna.jsp").forward(request, response);
                break;

            case 3: //Consulta actualizacion 
                BeanFauna BFa = DaoFauna.consultaporidentificador(id_fauna);
                if (BFa != null) {

                    request.setAttribute("bFauna", BFa);
                    request.getRequestDispatcher("actualizar_Fauna.jsp").forward(request, response);

                } else {
                    request.setAttribute("error", "<script>Swal.fire('La Fauna no se encontro')</script>");
                    request.getRequestDispatcher("Vista_fauna.jsp").forward(request, response);

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
