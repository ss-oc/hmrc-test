package uk.gov.hmrc.products

/**
 * User: rgallet
 * Date: 06/10/14 21:30
 */
class Orange extends Product{
  override def price: BigDecimal = BigDecimal("0.25")

  override def name: String = "orange"
}
