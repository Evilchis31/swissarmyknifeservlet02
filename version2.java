import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class version2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
            String jsonData = "{'name':'Emilio Vilchis', 'age':'20'}";
            res.setContentType("application/json");
            res.getWriter().write(jsonData);
    }
}