package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/callServlet")
public class CallServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public CallServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // GET ������� ��û���� ��� ��û�� �޴� �޼ҵ�
    	request.setCharacterEncoding("utf-8");	//	����ڰ� ���� ��û(request) ���� ��� ���ڵ��� ���ڵ��� �����ڵ�� ����
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	response.setContentType("text/html; charset=utf-8");
    	// ��û�ڿ��� ����(response)�ϱ� ���� ����(Content)�� ����(type)�� ����(set)
    	PrintWriter out = response.getWriter();	//	��û�ڿ��� �����ϱ� ���� ��� ��ü(PrintWriter)�� �ν��Ͻ� out ����
    	
    	out.println("<html><head><title></title></head>");
    	out.println("<body>");
    	
    	if (id == null || pw == null) {
        	out.println("<script>");
        	out.println("alert('���̵� ��ȣ�� �����ϴ�.')");
        	out.println("history.back();");
        	out.println("</script>");
    	}else {
        	out.println("<h2>GET������� ���� �� ���</h2>");
        	out.println("id : " + id + "<br/>");
        	out.println("pw : " + pw);
    	}   
    	out.println("</body></html>"); 	
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// POST ������� ��û���� ��� ��û�� �޴� �޼ҵ�
    	request.setCharacterEncoding("utf-8");
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String[] arr = request.getParameterValues("aa");	// aa ��� �̸��� ��Ʈ���� ���� ���� ��� �� ���� ���ڿ� �迭�� ���� �� ����
    	
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out = response.getWriter();
    	
    	out.println("<html><head><title></title></head>");
    	out.println("<body>");
        out.println("<h2>GET������� ���� �� ���</h2>");
        out.println("id : " + id + "<br/>");
        out.println("pw : " + pw + "<br/>"); 
        out.println("aa : "); 
        for (int i = 0; i < arr.length; i++) {
        	if (i > 0) out.print(", ");
        	out.print(arr[i]);
        }
    	out.println("</body></html>");
	}
}














