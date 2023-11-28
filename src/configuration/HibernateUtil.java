/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuration;

import dao.BarangDao;
import dao.BarangDaoImpl;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Farhan
 */
public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;
    private static final BarangDao BARANG_DAO;
    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            BARANG_DAO = new BarangDaoImpl(SESSION_FACTORY);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
    
    public static BarangDao getBarangDao() {
        return BARANG_DAO;
    }

}
