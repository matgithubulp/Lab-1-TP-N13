/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp13;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ejarq
 */
public class Tp13 {

    /**
     * @param args the command line arguments
     */
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
           //hola
           
           //Inscribir a 3 alumnos en 2 materias cada uno PUNTO 5          
           /*
           
           String slq = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                   + " VALUES (9, 1, 1), (4, 1, 2),"
                   + " (3, 2, 3), (5, 2, 4), "
                   + " (7, 3, 2), (10, 3, 3)";
           
           PreparedStatement inscripcion = conex.prepareStatement(slq);
           inscripcion.executeUpdate();
           
           */
           
           
           
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error al cargar Driver");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al realizar la conexion");
            
        }
    }
    
}
