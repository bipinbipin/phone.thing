/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.astontech.voiceapp;

import com.astontech.voiceapp.bo.UpdateObject;
import java.io.IOException;
import java.math.BigInteger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author seannils1
 */
public class ChangePhones extends HttpServlet {

    String validationErrors = null;

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
        request.getRequestDispatcher("./input.jsp").forward(request, response);
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

        if (validateForm(request)) {
            try {

                //Generate a Phone Object
                UpdateObject updObj = new UpdateObject();
                updObj.setSepID(request.getParameter("phoneID"));
                updObj.setNewMask(request.getParameter("mask"));

                TakeAWSDL ast = new TakeAWSDL();
                ast.init();
                //ast.execute();
                ast.executeUpdate(updObj);

                request.setAttribute("pageMessage", "<ul><li>Should have worked.</li></ul>");
            } catch (Exception e) {
                request.setAttribute("validationErrors", e.toString());
            }
        } else {
            request.setAttribute("validationErrors", validationErrors);
        }

        request.getRequestDispatcher("./input.jsp").forward(request, response);
    }

    protected boolean validateForm(HttpServletRequest request) {

        boolean retValue = true;

        StringBuilder sb = new StringBuilder();

        sb.append("<ul>");
        if (request.getParameter("phoneID") == null || request.getParameter("phoneID").isEmpty()) {
            sb.append("<li>You must select a phone.</li>");
            retValue = false;
        }
        if (request.getParameter("mask") == null || request.getParameter("mask").isEmpty()) {
            sb.append("<li>You must enter a new destination.</li>");
            retValue = false;
        } else {
            try{
                BigInteger i = new BigInteger(request.getParameter("mask"));
            } catch (Exception ex){
                System.out.println(ex.toString());
                sb.append("<li>You must enter only numberic values for the mask.</li>");
                retValue = false;
            }
        }
        sb.append("</ul>");

        if (retValue == false) {
            validationErrors = sb.toString();
        }
        return retValue;
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
