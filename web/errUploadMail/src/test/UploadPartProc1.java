package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/uploadPartProc1")
@MultipartConfig(
	fileSizeThreshold = 0,
	location = "E:/ljy/web/errUploadMail/WebContent/upload"
)
public class UploadPartProc1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UploadPartProc1() { super(); }
        
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");	// cos.jar�� �̿��� ����� �ٸ��� request��ü�� �̿��Ͽ� �Ϲ� ���ڿ� �����͸� ���� �� ����
		Part part = request.getPart("file1");		// ���ε�Ǵ� ������ Part�� �ν��Ͻ��� ����
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String contentDisposition = part.getHeader("content-disposition");
		System.out.println("contentDisposition : " + contentDisposition);
		
		String uploadName = getUploadFileName(contentDisposition);
		
		part.write(uploadName);
		out.println("���δ�" + name + "����" + uploadName + "������ ���ε� �߽��ϴ�."); 
	}
	private String getUploadFileName(String cd) {
		String uploadName = null;
		String[] arrContent = cd.split(";");

		int fIdx = arrContent[2].indexOf("\"");
		int sIdx = arrContent[2].lastIndexOf("\"");
		
		uploadName = arrContent[2].substring(fIdx + 1, sIdx);
		return uploadName;
	}
}
