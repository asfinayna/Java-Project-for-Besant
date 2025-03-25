package Mypack1;

public class WelcomeMessage {
	String info;
    
    public void init()
    {
   	 info="welcome to my page";
    }
    
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
   	 res.setContentType("text/html");
   	 
   	PrintWriter p=res.getWriter();
   	
   	p.print("<p style=color:red;font-size:40px>"+info+"</p>");
   	 
   	 
    }
    
    public void destroy()
    {
   	 
    }
    


}
