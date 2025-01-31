package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.internal.DBHelper;
import dao.internal.NoSuchProductException;
import dao.internal.Query;
import entity.Product;

public class ProductDAO extends DBHelper {
  private static final ProductDAO INSTANCE = new ProductDAO();

  public static ProductDAO getInstance() {
    return INSTANCE;
  }

  private ProductDAO() {
    // Empty constructor
  }

  public void insertProduct(Product product) throws SQLException {
    this.conn = this.getConnection();
    this.psmt = conn.prepareStatement(Query.INSERT_PRODUCT);
    psmt.setInt(1, product.getProdNo());
    psmt.setString(2, product.getProdName());
    psmt.setInt(3, product.getStock());
    psmt.setInt(4, product.getPrice());
    psmt.setString(5, product.getCompany());
    psmt.executeUpdate();

    this.close();
  }

  public List<Product> selectProducts() throws SQLException {
    List<Product> prods = new ArrayList<>();

    this.conn = this.getConnection();
    this.psmt = conn.prepareStatement(Query.SELECT_PRODUCTS);
    this.result = psmt.executeQuery();

    while (result.next()) {
      Product product = new Product();
      product.setProdNo(result.getInt(1));
      product.setProdName(result.getString(2));
      product.setStock(result.getInt(3));
      product.setPrice(result.getInt(4));
      product.setCompany(result.getString(5));

      prods.add(product);
    }

    this.close();

    return prods;
  }

  public Product selectProduct(int prodNo) throws SQLException, NoSuchProductException {
    Product prod = new Product();

    this.conn = this.getConnection();
    this.psmt = conn.prepareStatement(Query.SELECT_PRODUCT);

    psmt.setInt(1, prodNo);

    this.result = psmt.executeQuery();

    if (result.next()) {
      prod.setProdNo(result.getInt(1));
      prod.setProdName(result.getString(2));
      prod.setStock(result.getInt(3));
      prod.setPrice(result.getInt(4));
      prod.setCompany(result.getString(5));
    } else {
      String msg = String.format("주어진 제품 번호 %d(을)를 찾을 수 없음", prodNo);
      throw new NoSuchProductException(msg);
    }

    this.close();

    return prod;
  }
}
