package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/uploadPartProc2")
@MultipartConfig(
	fileSizeThreshold = 0,
	location = "E:/ljy/web/errUploadMail/WebContent/upload"
)
public class UploadPartProc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UploadPartProc2() { super(); }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String uploadFiles = "";									// ���ε��� ���ϵ��� �̸��� �����Ͽ� ������ ����
		
		for (Part part : request.getParts()) {						// getParts() : ����ڰ� ���� ������(��Ʈ��)���� Collection<Part>�� ��� ����, �޾ƿ� Part ��ü���� �ϳ��� Part�� �ν��Ͻ� part�� ��� ���� ��
			if (part.getName().startsWith("file")) {				// part�� �޾ƿ� ��Ʈ���� �̸��� file�� �����ϴ� ��Ʈ���� ��쿡�� �۾�
				String cd = part.getHeader("content-disposition");	// ��) form-data; name="file1"; filename="���ε��ϴ����ϸ�.Ȯ����" file��ü�� ������� form-data; name="file1"; filename=""
				String uploadName = getUploadFileName(cd);
				if (!uploadName.equals("")) {						// ���ε��� ������ ������
					uploadFiles += ", " + uploadName;
					part.write(uploadName);
				}
			}
		}
		if (!uploadFiles.equals(""))	uploadFiles = uploadFiles.substring(2);
		out.println("���δ�" + name + "����" + uploadFiles + "���ϵ��� ���ε� �߽��ϴ�."); 
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
