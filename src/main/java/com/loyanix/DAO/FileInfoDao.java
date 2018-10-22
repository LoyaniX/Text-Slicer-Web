package com.loyanix.DAO;

import com.loyanix.Beans.FileInfo;
import com.loyanix.Hibernate.HibernateConfig;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class FileInfoDao {
    public static List<FileInfo> get(){
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<FileInfo> fileInfos;
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FileInfo.class);
        fileInfos = criteria.list();
        session.getTransaction().commit();
        session.close();
        return fileInfos;
    }
}
