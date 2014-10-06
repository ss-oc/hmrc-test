package uk.gov.hmrc.products

/**
 * User: rgallet
 * Date: 06/10/14 21:28
 */
trait Product {
  def price: BigDecimal

  def name: String
}
