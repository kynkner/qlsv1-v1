package qlsv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;

/**
 * Servlet implementation class svlSV
 */
@WebServlet("/svlSV")
public class svlSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlSV() {
        super();
    }
    
    



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		StudentDAO dao = new StudentDAO();
//		List<SV> students = dao.getAllStudent();
		
//		StudentDAO dao = new StudentDAO();
//		SV sv = dao.insertStudent(getServletInfo(), getServletInfo(), getServletInfo(), getServletName(), getServletInfo())
//        request.setAttribute("students", students);
//        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
    }
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if("create".equals(action)) {
//			// TODO Auto-generated method stub
//			String parmasv=request.getParameter("parmasv").trim().toUpperCase();
//			String parhodemsv=request.getParameter("parhodem").trim();
//			String partensv=request.getParameter("partensv").trim();
//			String partelsv=request.getParameter("partelsv").trim();
//			String paremailsv=request.getParameter("paremailsv").trim();
//			try {
//				if((parmasv!=null && parmasv.length()>0) ||(partensv!=null && partensv.length()>0) || (parhodemsv!=null && parhodemsv.length()>0)  ){
//					SV svobj = new SV();
//					if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
//					if(parhodemsv!=null && parhodemsv.length()>0) svobj.setHodem(parhodemsv);
//					if(partensv!=null && partensv.length()>0) svobj.setTensv(partensv);
//					if(partelsv!=null && partelsv.length()>0) svobj.setTelsv(partelsv);//System.out.println("partelsv="+partelsv);
//					if(paremailsv!=null && paremailsv.length()>0) svobj.setEmailsv(paremailsv);
//					svobj.themSV();
//				}
//			} catch (Exception e) {
//				System.out.println(e.toString());
//			}
			
			String name = request.getParameter("parmasv");
			String parhodemsv=request.getParameter("parhodem");
			String partensv=request.getParameter("partensv");
			String partelsv=request.getParameter("partelsv");
			String paremailsv=request.getParameter("paremailsv");
			
			StudentDAO dao = new StudentDAO();
			SV sv = dao.insertStudent(name, partensv, parhodemsv, partelsv, paremailsv);
			
			request.setAttribute("students", sv);
	        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
	        
		}else if("modify".equals(action)) {
			// TODO Auto-generated method stub
//						String parmasv=request.getParameter("parmasv").trim().toUpperCase();
//						String parhodemsv=request.getParameter("parhodem").trim();
//						String partensv=request.getParameter("partensv").trim();
//						String partelsv=request.getParameter("partelsv").trim();
//						String paremailsv=request.getParameter("paremailsv").trim();
//						try {
//							if((parmasv!=null && parmasv.length()>0) ||(partensv!=null && partensv.length()>0) || (parhodemsv!=null && parhodemsv.length()>0)  ){
//								SV svobj = new SV();
//								if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
//								if(parhodemsv!=null && parhodemsv.length()>0) svobj.setHodem(parhodemsv);
//								if(partensv!=null && partensv.length()>0) svobj.setTensv(partensv);
//								if(partelsv!=null && partelsv.length()>0) svobj.setTelsv(partelsv);//System.out.println("partelsv="+partelsv);
//								if(paremailsv!=null && paremailsv.length()>0) svobj.setEmailsv(paremailsv);
//								svobj.upadteSV();
//							}
//						} catch (Exception e) {
//							System.out.println(e.toString());
//						}
			String parmasv = request.getParameter("parmasv");
			String parhodemsv=request.getParameter("parhodem");
			String partensv=request.getParameter("partensv");
			String partelsv=request.getParameter("partelsv");
			String paremailsv=request.getParameter("paremailsv");
			
			StudentDAO dao = new StudentDAO();
			SV sv = dao.updateStudent(parmasv, partensv, parhodemsv, partelsv, paremailsv);
			
			request.setAttribute("students", sv);
	        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
			
		}else if("delete".equals(action)) {
			String parmasv = request.getParameter("parmasv");
			
			StudentDAO dao = new StudentDAO();
			SV sv = dao.deleteStudent(parmasv);
			
			request.setAttribute("students", sv);
	        request.getRequestDispatcher("qlsv.jsp").forward(request, response);
			
				
			
//			// TODO Auto-generated method stub
//			String parmasv=request.getParameter("parmasv").trim().toUpperCase();
//			
//			try {
//				if((parmasv!=null && parmasv.length()>0)){
//					SV svobj = new SV();
//					if(parmasv!=null && parmasv.length()>0) svobj.setMasv(parmasv);
//					
//					svobj.deleteSV();
//				}
//			} catch (Exception e) {
//				System.out.println(e.toString());
//			}
		}
		

		doGet(request, response);
	}

}
