package uk.gov.hmrc.products

/**
 * Orange
 */
class Orange extends Product{
  override def price: BigDecimal = BigDecimal("0.25")

  override def name: String = "orange"
}
