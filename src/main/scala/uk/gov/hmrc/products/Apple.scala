package uk.gov.hmrc.products

/**
 * Apple
 */
class Apple extends Product{
  override def price: BigDecimal = BigDecimal("0.60")

  override def name: String = "apple"
}
