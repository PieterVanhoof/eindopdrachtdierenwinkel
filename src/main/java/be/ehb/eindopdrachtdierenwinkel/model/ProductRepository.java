package be.ehb.eindopdrachtdierenwinkel.model;

import org.hibernate.hql.internal.classic.HavingParser;
import org.hibernate.sql.Select;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.From;
import java.util.List;

public interface ProductRepository  extends CrudRepository <Product,Integer> {
    public List<Product> findByCategorieIgnoreCase(String categorie);
}
