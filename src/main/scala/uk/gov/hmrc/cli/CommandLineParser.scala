package uk.gov.hmrc.cli

import uk.gov.hmrc.products.Product
import uk.gov.hmrc.stocks.StockManager

/**
 * User: rgallet
 * Date: 06/10/14 21:52
 */
class CommandLineParser(stockManager: StockManager) {
  def parse(csv: String): List[Product] = {
    throw new NoSuchMethodError()
  }
}
