package uk.gov.hmrc.cart

import uk.gov.hmrc.products.Product

/**
 * User: rgallet
 * Date: 06/10/14 21:42
 */
class BasicShoppingCart extends ShoppingCart {
  override def addProduct(product: Product) {
    throw new NoSuchMethodError()
  }

  override def countProducts: Int = {
    throw new NoSuchMethodError()
  }
}
