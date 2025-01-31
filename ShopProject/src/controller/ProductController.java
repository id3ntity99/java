package controller;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import dao.internal.NoSuchProductException;
import entity.Product;
import service.ProductService;

public class ProductController {
  private static final Logger LOGGER = Logger.getLogger(ProductController.class.getName());
  private final ProductService service = new ProductService();

  private Product getProductInput(Scanner sc) {
    sc.nextLine();

    System.out.print("제품 번호: ");
    int prodNo = sc.nextInt();

    sc.nextLine();

    System.out.print("제품 이름: ");
    String prodName = sc.nextLine();


    System.out.print("수량: ");
    int stock = sc.nextInt();

    System.out.print("가격: ");
    int price = sc.nextInt();

    sc.nextLine();

    System.out.print("제조 회사: ");
    String company = sc.nextLine();

    return new Product(prodNo, prodName, stock, price, company);
  }

  private int getProductNumber(Scanner sc) {
    System.out.print("제품 번호: ");
    return sc.nextInt();
  }

  private void handleException(Exception e) {
    String msg = String.format("[예외 발생] %s%n[Stack Trace] %s", e.getMessage(),
        Arrays.toString(e.getStackTrace()));
    LOGGER.severe(msg);
  }

  public void manage(Scanner sc) {
    while (true) {
      System.out.println("=============Product Management=============");
      System.out.println("| 0: 돌아가기 | 1: 상품등록 | 2: 상품목록 | 3: 상품 검색 |");
      System.out.print("선택 >> ");

      int choice = sc.nextInt();

      switch (choice) {
        case 0: {
          return;
        }
        case 1: {
          Product newProduct = getProductInput(sc);
          try {
            service.register(newProduct);
          } catch (SQLException e) {
            this.handleException(e);
          }
          String msg = String.format("[상품 등록 완료] %s", newProduct);
          LOGGER.info(msg);
          break;
        }
        case 2: {
          try {
            List<Product> prods = service.getProducts();
            for (Product prod : prods) {
              String output =
                  String.format("제품 번호: %d%n제품 이름: %s%n수량: %d%n가격: %d%n제조사: %s%n", prod.getProdNo(),
                      prod.getProdName(), prod.getStock(), prod.getPrice(), prod.getCompany());
              System.out.println(output);
            }
          } catch (SQLException e) {
            this.handleException(e);
          }
          break;
        }
        case 3: {
          int prodNo = getProductNumber(sc);
          try {
            Product prod = service.search(prodNo);
            String msg =
                String.format("제품 번호: %d%n제품 이름: %s%n수량: %d%n가격: %d%n제조사: %s%n", prod.getProdNo(),
                    prod.getProdName(), prod.getStock(), prod.getPrice(), prod.getCompany());
            System.out.println(msg);
          } catch (SQLException e) {
            handleException(e);
          } catch (NoSuchProductException e) {
            LOGGER.warning(e.getMessage());
          }
          break;
        }
        default: {
          break;
        }
      }
    }
  }
}
