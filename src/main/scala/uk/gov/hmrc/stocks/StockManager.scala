package uk.gov.hmrc.stocks

import uk.gov.hmrc.products.Product

/**
 * User: rgallet
 */
trait StockManager {
  def isProductAvailable(productName: String): Boolean

  def getProduct(productName: String): Product
}
