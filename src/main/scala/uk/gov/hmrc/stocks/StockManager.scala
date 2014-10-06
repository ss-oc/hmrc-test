package uk.gov.hmrc.stocks

/**
 * User: rgallet
 * Date: 06/10/14 21:26
 */
trait StockManager {
  def isProductAvailable(productName: String): Boolean

}
