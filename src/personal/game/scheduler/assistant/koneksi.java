package personal.game.scheduler.assistant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//kelas untuk mengecek koneksi ke database

public class koneksi {
    private Statement data =null;
    private Connection koneksi=null;
    private String Url="jdbc:mysql://localhost:3306/gameschedulerassistant";
    private String DBUser="root";
    private String DBPassword="";
    
    public koneksi(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi=DriverManager.getConnection(Url,DBUser,DBPassword);
            data =this.koneksi.createStatement();
            
            System.out.println("Koneksi berhasil");
        }
        catch(Throwable ex){
            System.out.println("Belum Terkoneksi Database");
        }
    }
    
    public  Connection getConnection(){
        return koneksi;
    }
    
    public Statement getStatement(){
        return data;
    }  
    
    public static void main(String[]args){
        koneksi con = new koneksi();
        }  
   
}

