package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//QUESTAO D
public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
	public static EntityManager criarEntityManager() {
		return emf.createEntityManager();
	}
}
