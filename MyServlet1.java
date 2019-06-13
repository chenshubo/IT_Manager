package cn.lvb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *      servlet参数及ServletConfig
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletConfig config = this.getServletConfig();
		test1();
		
		test2();
		
		test3();
		
		System.out.println("hello aaaaaaaaaa");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		this.config = config;
		super.init(config);
	}
	
	
	
	
private void test1() {
		
		String value1 = config.getInitParameter("aaa");
		System.out.println(value1);
	}
	
	//得到所有的参数及参数的值
	private void test2() {
		Enumeration e = config.getInitParameterNames();
		while(e.hasMoreElements()){
			String paramName = (String)e.nextElement();
			System.out.println(paramName+"="+config.getInitParameter(paramName));
		}
	}
	
	
	private void test3() {
		String name = config.getServletName();
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
	
	
	

}
