

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

public class FileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fileName = request.getParameter("fileName");
        boolean overwrite = request.getParameter("overwrite") != null;

        String uploadDirectory = getServletContext().getInitParameter("uploadDirectory");
        File targetFile = new File(getServletContext().getRealPath(uploadDirectory), fileName);

        if (targetFile.exists()) {
            if (overwrite) {

            	response.getWriter().write("File is Overwritten.");
            } else {
                response.getWriter().write("File already exists, and Overwrite is not checked.");
            }
        } else { 
            response.getWriter().write("File Written.");
        }
    }
}