package service;

import java.sql.SQLException;
import java.util.List;
import dao.ProductDAO;
import dao.internal.NoSuchProductException;
import entity.Product;

public class ProductService {
  private static final ProductService INSTANCE = new ProductService();

  public static ProductService getInstance() {
    return INSTANCE;
  }

  private final ProductDAO dao = ProductDAO.getInstance();

  private ProductService() {
    // Empty constructor
  }

  public void register(Product product) throws SQLException {
    dao.insertProduct(product);
  }

  public List<Product> getProducts() throws SQLException {
    return dao.selectProducts();
  }

  public Product search(int prodNo) throws SQLException, NoSuchProductException {
    return dao.selectProduct(prodNo);
  }
}
