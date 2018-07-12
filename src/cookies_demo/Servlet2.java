package cookies_demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        test_1(request, response);
    }

    private void test_1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
//        request.getContextPath()
        //读取cookie
        Cookie[] cookies = request.getCookies();
        for (int i = 0; cookies!=null && (i < cookies.length); i++) {
            if ("time".equals(cookies[i].getName())){
                out.write("上次登录时间："+cookies[i].getValue());
            }
        }
        //set cookies
        Cookie ck = new Cookie("time", "2017.2.1");
        ck.setMaxAge(10);
        ck.setPath("/");
//        ck.setMaxAge(0);   //删除
        response.addCookie(ck);
    }
}
