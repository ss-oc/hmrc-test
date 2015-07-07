package uk.gov.hmrc.cart

import uk.gov.hmrc.products.Product

/**
 * Basic shopping cart with no promotional specific behavior
 *
 * TODO: proper loggingv  ss
 */
class BasicShoppingCart extends ShoppingCart {
  private var items = List[Product]()

  /**
   * A more complex system would probably add composition over Product,
   * to reference things like the price of the item when added, a timestamp, etc.
   *ss
   * @param product Product to add to cart
   */
  override def addProduct(product: Product) = items = product :: items

  override def products: List[Product] = items

  /**
   * Counts products in cart
   *
   * @return number of products
   */
  override def countProducts = items.size

  /**
   * Counts specific products in cart
   *
   * @return number of products
   */
  override def countProducts(productName: String) = {
    items.filter(_.name == productName.toLowerCase).size
  }

  /**
   * Calculates values of cart
   * @return value of cart in pounds and pennies
   */
  override def calculateTotal: BigDecimal = {
    eligibleProducts.foldLeft(BigDecimal(0)) { (price, product) =>
      product.price + price
    }
  }

  /**
   * In a basic cart, all products count towards final price.
   *
   * @return all products in cart
   */
  override def eligibleProducts = products
}
