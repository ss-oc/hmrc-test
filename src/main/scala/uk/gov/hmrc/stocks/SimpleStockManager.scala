package uk.gov.hmrc.stocks

import uk.gov.hmrc.products.{Apple, Orange}

/**
 * User: rgallet
 * Date: 06/10/14 21:26
 */
class SimpleStockManager extends StockManager {
  //a real system would get that from some DAO
  private val availableProducts = List(new Orange, new Apple)

  override def isProductAvailable(productName: String): Boolean = {

    availableProducts.exists {
      _.name == productName.toLowerCase
    }
  }

  override def getProduct(productName: String) = {
    isProductAvailable(productName) match {
      case true =>
        availableProducts.find {
          _.name == productName.toLowerCase
        }.get
      case _ =>
        throw new ProductNotFoundException
    }
  }
}
