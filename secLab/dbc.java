import java.sql.*;  
class dbc{
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("HHHH");
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/jdb","root","venkatrao_sp1");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from stud");  
            while(rs.next()){
                System.out.println("Name: "+rs.getString(1)+", EnrollNo: "+rs.getInt(2)+", Section: "+ rs.getString(3));
            }
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}