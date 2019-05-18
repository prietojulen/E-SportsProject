
package modeloDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Sesion;


public class SesionDB {


    private static ResultSet resultado;
    private static PreparedStatement sentenciaPre;

     public SesionDB() {
         
       
    }
    
    public static Sesion consultarUsuario(String usuario, String password) throws Exception{
       
         GenericoDB.conectar();
         String plantilla = "select * from sesion where USUARIO = ? and PASSWORD = ?";
         sentenciaPre = GenericoDB.getCon().prepareStatement(plantilla);
         
          sentenciaPre.setString(1,usuario);
          sentenciaPre.setString(2,password);
         
          Sesion oSesion = new Sesion();
          resultado = sentenciaPre.executeQuery();
          if(resultado.next()){
              oSesion.setNombreUsuario(resultado.getString("USUARIO"));
              oSesion.setPassword(resultado.getString("PASSWORD"));
              oSesion.setTipoUsuario(resultado.getString("TIPO"));
              GenericoDB.cerrarCon();
              return oSesion;
          }
          GenericoDB.cerrarCon();
          return null;
        
    }
    public static int insertarAdministrador(String nombre,String password) throws SQLException, Exception{
         GenericoDB.conectar();
         
         String plantilla = "insert into sesion (nombre,password) values(?,?,'administrador')";
         sentenciaPre = GenericoDB.getCon().prepareStatement(plantilla);
        
          sentenciaPre.setString(1,nombre);
          sentenciaPre.setString(2,password);
          
        int insercion = sentenciaPre.executeUpdate();
        System.out.println(insercion);
        
        GenericoDB.cerrarCon();
       
        return insercion;
    }
    
    
}
