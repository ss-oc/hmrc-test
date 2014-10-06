package uk.gov.hmrc.cart

import uk.gov.hmrc.products.Product

/**
 * User: rgallet
 * Date: 06/10/14 21:42
 */
class BasicShoppingCart extends ShoppingCart {
  private var items = List[Product]()

  override def addProduct(product: Product) = items = product :: items

  override def countProducts = items.size
}
