/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BEAN.BeanGuardabosques;
import DAO.DaoGuardabosques;
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
@WebServlet(name = "SelvletGuardabosques", urlPatterns = {"/Guardabosques"})
public class SelvletGuardabosques extends HttpServlet {

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

        String id_guarda = request.getParameter("id_guarda");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String poblacionAledaña = request.getParameter("poblacionAledana");
        String TipoDocumento = request.getParameter("TipoDocumento");
        String numeroDocumento = request.getParameter("numeroDocumento");

        BeanGuardabosques BGuardabosques = new BeanGuardabosques(id_guarda, nombre, apellido, telefono, poblacionAledaña, TipoDocumento, numeroDocumento);
        DaoGuardabosques DGuardabosques = new DaoGuardabosques(BGuardabosques);

        switch (opcion) {
            case 1:
                if (DGuardabosques.AgregarRegistro()) {
                    request.setAttribute("exito", "<script>alert('El Guardabosques fue creado correctamente')</script>");
                    request.getRequestDispatcher("registrar_geositio.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", "<script>alert('El Guardabosques no pudo ser registrado correctamente')</script>");
                }

                request.getRequestDispatcher("registrar_geologo.jsp").forward(request, response);

                break;

            case 2://   Actualizar Registro
                if (DGuardabosques.ActualizarRegistro()) {
                    request.setAttribute("exito", "<script>alert('El Guardabosques fue actualizado correctamente')</script>");
                    request.getRequestDispatcher("vista_Guardabosques.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", "<script>alert('El Guardabosques no pudo ser actualizado correctamente')</script>");
                }
                request.getRequestDispatcher("actualizar_Guardabosques.jsp").forward(request, response);
                break;

            case 3: //Consulta actualizacion 
                BeanGuardabosques BGu = DaoGuardabosques.consultaporidentificador(id_guarda);
                if (BGu != null) {

                    request.setAttribute("bGuardabosques", BGu);
                    request.getRequestDispatcher("actualizar_guardabosques.jsp").forward(request, response);

                } else {
                    request.setAttribute("error", "<script>alert('El Guardabosques no se encontro')</script>");
                    request.getRequestDispatcher("Vista_Guardabosques.jsp").forward(request, response);

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
