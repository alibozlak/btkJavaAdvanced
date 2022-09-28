package hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println();

        // Session
        // Transaction (Update'te sıkıntı olursa Insert'ü de iptal etmeli)

        SessionFactory factory 
        = new Configuration().configure("hibernate.cfg.xml") 
        .addAnnotatedClass(UsState.class).buildSessionFactory();

        // 'Unit of Work' Tasarım Deseni'nin uygulanmış hali session
        Session session  = factory.getCurrentSession();
        
        try {
            session.beginTransaction();

            // HQL (Hibernate Query Language)

            // from City
            // from City c where c.countryCode='TUR'
            // from City c where c.countryCode='TUR' OR c.countryCode='USA'
            // from City c where c.countryCode='TUR' AND c.district='Ankara'
            // from City c where c.name LIKE '%kar%'
            // from City c ORDER BY c.name
            // ASC (Ascending) --> default
            // DESC (Descending)
            List<UsState> usStates = session.createQuery("from UsState").getResultList();

            // select c.countryCode from City c GROUP BY c.countryCode
            
            // INSERT :
            // City city = new City("Düzce","TUR","Karadeniz",100_000);
            // session.save(city);  <--- Insert

            // UPDATE :
            // City city = session.get(City.class, 4086)
            // city.setPopulation(110_000);
            // session.save(city);

            // DELETE :
            // City city = session.get(City.class, 4086);
            // session.delete(city);

            for (UsState usState : usStates) {
                System.out.println(usState.getStateName() + " - " + usState.getStateRegion());
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
