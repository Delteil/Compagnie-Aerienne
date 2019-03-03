package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import database.DatabaseHandler;

public class Main {
	
	public static void main(String[] args) {

		EntityManager em = DatabaseHandler.getEntityManagerFactory();

		EntityTransaction transaction = em.getTransaction();

		// Begin the transaction
//		transaction.begin();
	}
}
