package database;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DatabaseHandler {

	// Create an EntityManagerFactory when you start the application.
	private static EntityManager entityManager;

	public static synchronized EntityManager getEntityManagerFactory() {
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = Persistence.createEntityManagerFactory("compagnie_aerienne1").createEntityManager();
		}

		return entityManager;
	}

}
