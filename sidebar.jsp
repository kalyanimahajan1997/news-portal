<%-- 
    Document   : sidebar
    Created on : 23 Feb, 2020, 4:05:40 PM
    Author     : kalyani
--%>

<%@page  import="java.sql.*"%>
<div class="col-lg-3">

        <h1 class="my-4">top news</h1>
        <div class="list-group">
            <a href="home.jsp" class="list-group-item <%if(request.getParameter("cat_id")==null) out.println(" active ");%>"> All News </a>   <br/>
                   
            <%
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
                     String sql="select * from news_category";
                      PreparedStatement smt = con.prepareStatement(sql);
                       ResultSet rs = smt.executeQuery();
                                  int i = 1;
                                   while (rs.next()) {%>
                                   <a href="home.jsp?cat_id=<%=rs.getString("id")%>" class="list-group-item <%if(rs.getString("id").equals(String.valueOf(request.getParameter("cat_id")))) out.println(" active ");%>"> <%=rs.getString("name")%> </a>   <br/>
                        <%}
                                con.close();
                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }

                %>
                            
                
                
           
        </div>
                
    <button type="button" class="btn btn-dark" data-toggle="modal" data-target="#myModal">
    Subscribe Us
    </button>

     <!-- The Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Fill the Basic Details</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
           <form method="post" class="form bg-light">
                        <input type="text" placeholder="Enter Name" name="name" class="form-control"> <br/><br/>
                        <input type="email" name="email" placeholder="Enter your email" class="form-control"/> <br/><br/>
                        <input type="submit" value="Subscribe" class="btn btn-dark form-control" name="submit"/>
         </form>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>           
    </div>        

  </div>
</div>
    