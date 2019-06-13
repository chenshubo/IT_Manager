package cn.lvb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 * ServletContext�������ݼ�ת��
 * MyServlet2��MyServlet3������ݹ���  
 */
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		test2(request,  response);
		
		/*ServletContext context = this.getServletContext();//���ݹ��� ��ת��
		context.setAttribute("data", "this servlet save data");
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	

	
	
	//��ȡȫ�ֲ���
	public void test1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServletContext sc = getServletContext();
		String value = sc.getInitParameter("aaa");
		response.getOutputStream().write(value.getBytes());
		
	}
	
	//���ò���
	public void test2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext sc = this.getServletContext();
		
		sc.setAttribute("p1", "pp");
		sc.setAttribute("p2", "pppppp");
		
		System.out.println("����");
	}
	
	
	
	
	
	//ת��
		public void test3(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			RequestDispatcher re = this.getServletContext().getRequestDispatcher("/login.html");
			
			 re.forward(request, response);  
			
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
}
