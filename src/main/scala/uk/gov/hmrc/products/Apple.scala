package uk.gov.hmrc.products

/**
 * User: rgallet
 * Date: 06/10/14 21:30
 */
class Apple extends Product{
  override def price: BigDecimal = BigDecimal("0.60")

  override def name: String = "apple"
}
