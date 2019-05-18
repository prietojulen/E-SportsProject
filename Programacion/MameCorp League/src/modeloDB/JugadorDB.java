/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Jugador;
import modelo.Sesion;

/**
 *
 * @author 1gdaw03
 */
public class JugadorDB {
    private static ResultSet resultado;
    private static PreparedStatement sentenciaPre;
    


public static Jugador consultarJugador(String nick) throws SQLException, Exception{
 
    GenericoDB.conectar();
    
         String plantilla = "select * from jugador where NICKNAME = ?";
         sentenciaPre = GenericoDB.getCon().prepareStatement(plantilla);
         
          sentenciaPre.setString(1,nick);
          Jugador oJugador = new Jugador();
          resultado = sentenciaPre.executeQuery();
          if(resultado.next()){
              oJugador.setNickname(resultado.getString("NOMBRE"));
              oJugador.setApellido(resultado.getString("APELLIDO"));
              oJugador.setNickname(resultado.getString("NICKNAME"));
              oJugador.setPosicion(resultado.getString("POSICION"));
              oJugador.setSueldo(resultado.getInt("SUELDO"));
              oJugador.setTitularidad(resultado.getBoolean("TITULARIDAD"));
              EquipoDB oEquipoDB = new EquipoDB();
            //  Equipo oEquipo = oEquipoDB.consultarTodos()
            //  oJugador.setoEquipo(resultado.getObject("EQUIPO"));
              
              GenericoDB.cerrarCon();
              return oJugador;
          }
          GenericoDB.cerrarCon();
          return null;
}


}