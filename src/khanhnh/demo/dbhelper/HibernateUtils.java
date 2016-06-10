package khanhnh.demo.dbhelper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils{
	private SessionFactory sessionFactory=null;
	
	public HibernateUtils(){
		try{
//			Configuration cf=new Configuration();
//			cf.configure();
//			ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build(); 
//			sessionFactory=cf.buildSessionFactory(sr);
			
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				    .configure()
				    .build();

				Metadata metadata = new MetadataSources( standardRegistry )
				    .getMetadataBuilder()
				    .applyImplicitNamingStrategy( ImplicitNamingStrategyJpaCompliantImpl.INSTANCE )
				    .build();

				sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}
	
	public SessionFactory GetSessionFactory(){
		return sessionFactory;
	}
}
