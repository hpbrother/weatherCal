/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.com.model.dao.data;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import tw.com.mode.vo.ProductMaster;
import tw.com.model.base.HibernateUtil;

/**
 *
 * @author hpbrother
 */
public class ProductService {

    public List<ProductMaster> findProductMasterByStatusAndPage(String status, int page) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction(); //開啟交易
            
            //Query hqlQuery = session.createQuery("select pm from ProductMaster pm where pm.productStatus = :status");
            //hqlQuery.setParameter("status", status);
            Query hqlQuery = session.createQuery("select pm from ProductMaster pm");
           // hqlQuery.setParameter("status", status);
            
            return hqlQuery.list();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.getTransaction().commit();
            session.close();
        }
        return null;
    }

    public ProductMaster findProductmasterByProductId(String ProductId) {

        List<ProductMaster> lpm = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction(); //開啟交易
            
            Query hqlQuery = session.createQuery("select pm from ProductMaster pm where pm.id.productId = :ProductId");
            hqlQuery.setParameter("ProductId", ProductId);
            
            lpm = hqlQuery.list();
            
         
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.getTransaction().commit();
            session.close();
        }
        
        if (lpm == null || lpm.size() < 1) {
            return null;
        }else {
            return lpm.get(0);
        }
    }

    public ProductMaster modifyProductMaster(ProductMaster pm) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction(); //開啟交易
            
            session.update(pm);
            
         
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.getTransaction().commit();
            session.close();
        }
        
        return pm;
    }

}
