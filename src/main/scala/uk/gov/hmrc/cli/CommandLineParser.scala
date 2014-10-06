package uk.gov.hmrc.cli

import uk.gov.hmrc.products.Product
import uk.gov.hmrc.stocks.StockManager

import scala.util.{Failure, Success, Try}

/**
 * Parses a comma-separated list of apples and oranges
 *
 * TODO: proper logging
 */
class CommandLineParser(stockManager: StockManager) {
  def parse(csv: String): List[Product] = {
    csv.split(",").foldLeft(List[Product]()) { (products, productName) =>
      Try(stockManager.getProduct(productName.trim.toLowerCase)) match {
        case Success(v) => v :: products
        case Failure(e) =>
          println(s"Could not parse product [$productName]. Sorry, we only sell apples and oranges.")
          products
      }
    }
  }
}
