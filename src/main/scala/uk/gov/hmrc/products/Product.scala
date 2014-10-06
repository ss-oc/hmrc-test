package uk.gov.hmrc.products

/**
 * Voluntarily NOT overriding hashcode() and equals()
 */
trait Product {
  def price: BigDecimal

  def name: String
}
