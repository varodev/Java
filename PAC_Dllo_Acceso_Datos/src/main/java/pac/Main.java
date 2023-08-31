package pac;

import pac.Alumno;
import pac.Modulo;
import pac.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.io.*;
import java.util.*;
import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		System.out.println("INICIO DE PROGRAMA...");
		/*5. Creación de una clase con nombre Main donde se realizará la conexión con Hibernate, se ejecutarán las funciones de insert anteriores.*/
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		Session session = sessionFactory.openSession();
		
		System.out.println("CONFIGURACION REALIZADA");
		
		Set<Modulo>alumno_modulo = new HashSet<Modulo>();
		
		/*4. Creación de funciones que realizaran los inserts en la BD con hibernate, después de cada inserción debe mostrar un mensaje por pantalla.
				a. Modulo (nombre, código):
					• Programacion B, M03B
					• Acceso a Datos, M06
					• Desarrollo de aplicaciones moviles, M08
					• Servicios y procesos, M09
				Mensaje por pantalla:
				Insert into modulo, nombre: {nombre}, codigo {codigo}*/
		Modulo modProg = new Modulo("Programacion B", "M03B");
		Modulo modAcceso = new Modulo("Acceso a Datos", "M06");
		Modulo modPMDM = new Modulo("Desarrollo de aplicaciones moviles", "M08");
		Modulo modPSP = new Modulo("Servicios y procesos", "M09");
		
		/*b. Profesor (nombre, sexo)
			• Alvaro, Hombre
			Mensaje por pantalla:
			Insert into profesor, nombre: {nombre}, sexo: {sexo}*/
		Profesor profAlvaro = new Profesor("Alvaro", "Hombre");
		
		/*c. Alumno (nombre, nacionalidad, edad, sexo, set<módulos>)
			• Juan, Espaniola, 26, Hombre, Modulos (1,2,3,4)
			• Pedro, Andorrana, 21, Hombre, Modulos (1,2,4)
			• Marta, Espaniola, 19, Mujer, Modulos (3,4)
			• Carla, Francesa, 35, Mujer, Modulos (2,3,4)
			Mensaje por pantalla:
			Insert into alumno, nombre: {nombre}, nacionalidad: {nacionalidad}, edad: {edad}, sexo: {sexo}, modulos: {nº módulos}*/
		Alumno alumJuan = new Alumno("Juan", "Espaniola", 26, "Hombre", alumno_modulo);
		alumJuan.modulos.add(modProg);
		alumJuan.modulos.add(modAcceso);
		alumJuan.modulos.add(modPMDM);
		alumJuan.modulos.add(modPSP);
		Alumno alumPedro = new Alumno("Pedro", "Andorrana", 21, "Hombre", alumno_modulo);
		alumPedro.modulos.add(modProg);
		alumPedro.modulos.add(modAcceso);
		alumPedro.modulos.add(modPSP);
		Alumno alumMarta = new Alumno("Marta", "Espaniola", 19, "Mujer", alumno_modulo);
		alumMarta.modulos.add(modPMDM);
		alumMarta.modulos.add(modPSP);
		Alumno alumCarla = new Alumno("Carla", "Francesa", 35, "Mujer", alumno_modulo);
		alumCarla.modulos.add(modAcceso);
		alumCarla.modulos.add(modPMDM);
		alumCarla.modulos.add(modPSP);
		
		//Modulos
		Transaction tx = session.beginTransaction();
		session.save(modProg);
		tx.commit();
				
		tx = session.beginTransaction();
		session.save(modAcceso);
		tx.commit();
				
		tx = session.beginTransaction();
		session.save(modPMDM);
		tx.commit();
				
		tx = session.beginTransaction();
		session.save(modPSP);
		tx.commit();
				
		//Profesor
		tx = session.beginTransaction();
		session.save(profAlvaro);
		tx.commit();
				
		//Alumnos
		tx = session.beginTransaction();
		session.save(alumJuan);
		tx.commit();
				
		tx = session.beginTransaction();
		session.save(alumPedro);
		tx.commit();
				
		tx = session.beginTransaction();
		session.save(alumMarta);
		tx.commit();
			
		tx = session.beginTransaction();
		session.save(alumCarla);
		tx.commit();
					
		//Recuperar los datos de las Bases de datos
		tx = session.beginTransaction();
		List<?> list1 = session.createQuery("FROM Modulo").list();
		 	for(int i = 0; i<list1.size(); i++){		
				System.out.println(list1.get(i).toString());
			}
		      
		List<?> list2 = session.createQuery("FROM Profesor").list();
			for(int i = 0; i<list2.size(); i++){		
				System.out.println(list2.get(i).toString());
			}
		
		List<?> list3 = session.createQuery("FROM Alumno").list();
		 	for(int i = 0; i<list3.size(); i++){		
				System.out.println(list3.get(i).toString());
			}
			session.close();
	        sessionFactory.close();
		}//main
}//Main