package servlet;

import dao.studentdao;
import daoimpl.studentdaoimpl;
import entity.student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/stud")
public class servletstu extends HttpServlet {

    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String op=request.getParameter("op");
        if(op.equals("login")){
            String name=request.getParameter("name");
            String pass=request.getParameter("pass");
            studentdao  ko=new studentdaoimpl();
            student lp=ko.login(new student(name,pass));
            request.getSession().setAttribute("ff",lp);
            System.out.println(request.getSession().getAttribute("ff"));
            System.out.println(lp);
            if(lp!=null){
                //response.sendRedirect("success.jsp");
                request.getRequestDispatcher("success.jsp").forward(request,response);
            }else{
                response.sendRedirect("fril.jsp");
            }


        }

    }
}
