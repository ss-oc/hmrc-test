package uk.gov.hmrc.stocks

import uk.gov.hmrc.products.Product

/**
 * User: rgallet
 * Date: 06/10/14 21:26
 */
trait StockManager {
  def isProductAvailable(productName: String): Boolean

  def getProduct(productName: String): Product
}
