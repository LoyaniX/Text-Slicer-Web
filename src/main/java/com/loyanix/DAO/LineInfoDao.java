package com.loyanix.DAO;

import com.loyanix.Beans.LineInfo;
import com.loyanix.Hibernate.HibernateConfig;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class LineInfoDao {
    private static int id;
     public static List<LineInfo> get(){
         SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
         Session session = sessionFactory.openSession();
         List<LineInfo> lineInfos;
         session.beginTransaction();
         Criteria criteria = session.createCriteria(LineInfo.class);
         lineInfos = criteria.add(Restrictions.eq("fileId",id)).list();
         session.getTransaction().commit();
         session.close();
         return lineInfos;
     }

    public static void setId(int id) { LineInfoDao.id = id; }
}
