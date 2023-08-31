//import java.lang.module.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		System.out.println("INICIO DEL PROGRAMA....");
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		Session session = sessionFactory.openSession();
		
		System.out.println("CONFIGURACION REALIZADA");
		
		Transaction tx = session.beginTransaction();
		Alumno a = new Alumno();
		a.setNombre("Alberto");
		a.setEdad(18);
		session.save(a);
		
		tx.commit();
		
		//Recuperar los datos de la BD
		tx = session.beginTransaction();
		List<?> list = session.createQuery("FROM Alumno").list();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
			session.close();
			sessionFactory.close();
	}

}
