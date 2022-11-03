package jdbc1;
 
import java.sql.*;
 

public class jdbcexpreparedstatement {
 
    public static void main(String[] args) {


        //step 1: register Driver class with DriverManager

        try
        {
    //    Class.forName("com.mysql.jdbc.Driver"); //deprecated
        Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        //step 2: ask SQL Connection from Driver Manager class, providing connction url,username,password
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restapi?useSSL=false","root","namrata");)
        {


            //step 3: get statement object from Connection
    PreparedStatement st = 
            con.prepareStatement("Select studid,studname,studsurname from student1 where studid=? and studname=?");


              st.setInt(1,2);
              st.setString(2, "Arjun");
              //step 4: fire/execute query on Statement object and collect the ResultSet object 
              ResultSet rs = st.executeQuery();

            //step 5: Iterate through the ResultSet top fetch the rows  
              while(rs.next())
              {
                  //step 6: Use Resultset- getxxxx(column no) tpo fetch particular column value
                  int id = rs.getInt(1);

                  String name = rs.getString(2);

                  String surname = rs.getString(3);

                  System.out.println("id="+id+", name="+name+", surname="+surname);
              }

              st.setInt(1,3);
              st.setString(2, "Rahul");
              //step 4: fire/execute query on Statement object and collect the ResultSet object 
              rs = st.executeQuery();

            //step 5: Iterate through the ResultSet top fetch the rows  
              while(rs.next())
              {
                  //step 6: Use Resultset- getxxxx(column no) tpo fetch particular column value
                  int id = rs.getInt(1);

                  String name = rs.getString(2);

                  String surname = rs.getString(3);

                  System.out.println("id="+id+", name="+name+", surname="+surname);
              }


              rs.close();
              st.close();

              //step 6: connection is auto closed as u r using try with resource.
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }


 
    }
 
}