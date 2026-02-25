package com.adminPanel.app.dao;
import com.adminPanel.app.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    // Helper method
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Product product) {
        getSession().save(product);
    }

    @Override
    public void update(Product product) {
        getSession().update(product);
    }

    @Override
    public void delete(int id) {
        Product product = getSession().get(Product.class, id);
        if (product != null) {
            getSession().delete(product);
        }
    }

    @Override
    public Product getById(int id) {
        return getSession().get(Product.class, id);
    }

    @Override
    public List<Product> getAll() {
        return getSession()
                .createQuery("from Product", Product.class)
                .list();
    }
}