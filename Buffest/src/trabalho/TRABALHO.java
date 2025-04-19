package trabalho;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

public class TRABALHO {

    public static void main(String[] args) {
        Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/trabalhopi";
            String usuario = "root"; 
            String senha = "5563"; 
            conn = DriverManager.getConnection(url,  usuario,  senha);
            System.out.println("Conectado");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(conn !=null)
                    conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    
}