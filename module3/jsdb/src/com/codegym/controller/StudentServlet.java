package com.codegym.controller;

import com.codegym.dao.IStudentRepository;
import com.codegym.dao.StudentRepository;
import com.codegym.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "StudentServlet" ,urlPatterns = {"","/students"})
public class StudentServlet extends HttpServlet {
    private IStudentRepository studentService=new StudentRepository();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
       if(action.equals("update")){
           Integer id=Integer.parseInt(request.getParameter("id"));
           String name=request.getParameter("name");
           int age=Integer.parseInt(request.getParameter("age"));
           String address=request.getParameter("address");
           Student student=new Student(id,name,age,address);
           studentService.save(student);


       }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "update":
                break;
            default:
                try {
                    request.setAttribute("studentInfo",studentService.selectAllStudent());
                    request.getRequestDispatcher("/students/a.jsp").forward(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }


                break;
        }
    }
}
