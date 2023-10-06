
package tp13;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tp13 {

   
    public static void main(String[] args) {
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
            
           Connection conex =  DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidad", "root", "");
            
           
           //Cargar de los alumnos PUNTO 3  
           /*
           
           String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaDeNacimiento, estado) "
                   + "VALUES (45983444, 'Quiroga', 'Jose', '2004/10/5', true), (42983444, 'Del Castillo', 'Rosa', '2002/3/20', true), (41570334, 'Akerman', 'Lucia', '2001/9/15', true)";
           
            PreparedStatement alumnos = conex.prepareStatement(sql);
            alumnos.executeUpdate();
           
            */
           
           
           //Cargar materias    PUNTO 4
           /*
           String sql = "INSERT INTO materia (nombre, anio, estado)"
                   + " VALUES ('Matematica', 1, true),"
                   + "  ('Ingles', 3, true), ('Literatura', 2, true), "
                   + "('Laboratorio 1', 1, true)";
           
           PreparedStatement materia = conex.prepareStatement(sql);
           materia.executeUpdate();
           */
          
           //Inscribir a 3 alumnos en 2 materias cada uno PUNTO 5          
           /*
           
           String slq = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                   + " VALUES (9, 1, 1), (4, 1, 2),"
                   + " (3, 2, 3), (5, 2, 4), "
                   + " (7, 3, 2), (10, 3, 3)";
           
           PreparedStatement inscripcion = conex.prepareStatement(slq);
           inscripcion.executeUpdate();
           
           */
           
           //Punto 6 Listar los datos de los alumnos con calificaciones superiores a 8.
           /*
           String sql = "SELECT DISTINCT alumno.* FROM alumno JOIN inscripcion  ON (alumno.idAlumno = inscripcion.idAlumno) WHERE inscripcion.nota > 8";
           PreparedStatement lista = conex.prepareStatement(sql);
           
           ResultSet resul = lista.executeQuery();
           
           while(resul.next()){
           
               System.out.println("ID: " + resul.getInt("idAlumno"));
               
               System.out.println("DNI: " + resul.getInt("dni"));
               
               System.out.println("Apellido: " + resul.getString("apellido"));
               
               System.out.println("Nombre: " + resul.getString("nombre"));
               
               LocalDate fecha = resul.getDate("fechaDeNacimiento").toLocalDate();
               System.out.println("Nacimiento: " + fecha);
               
               System.out.println("Apellido: " + resul.getBoolean("estado"));
             //s
           }
           */
           
           //PUNTO 7. Desinscribir un alumno de una de la materias.
           /*
           String sql = "DELETE FROM inscripcion WHERE idAlumno = 2 && idMateria = 3";
           PreparedStatement quitar = conex.prepareStatement(sql);
           
           quitar.executeUpdate();         
           */
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error al cargar Driver");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al realizar la conexion");
            
        }
    }
    
}
