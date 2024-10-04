package edu.kh.todolist.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.todolist.model.dto.Todo;
import edu.kh.todolist.model.service.TodoListService;
import edu.kh.todolist.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/todo/detail")
public class DetailServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			// Service 객체 생성
			TodoListService service = new TodoListServiceImpl();
			
			// 전체 할 일 목록 Service 호출해서 얻어오기
			List<Todo> todoList = service.todoListFullView();
			
			// request scope 객체 값을 추가
			req.setAttribute("todoList", todoList);
			
			// 디테일 페이지 담당하는 jsp에 요청 위임
			String path = "/WEB-INF/views/detail.jsp";
			req.getRequestDispatcher(path).forward(req, resp);
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
