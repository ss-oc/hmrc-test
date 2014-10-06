package uk.gov.hmrc.cart

import uk.gov.hmrc.products.Product

/**
 * User: rgallet
 * Date: 06/10/14 21:41
 */
trait ShoppingCart {
  def addProduct(product: Product)

  def countProducts: Int

  def countProducts(productName: String): Int

  def calculateTotal: BigDecimal

  def products: List[Product]
}
