package uk.gov.hmrc.cart

/**
 * User: rgallet
 * Date: 06/10/14 23:38
 */
trait Offers {
  this: ShoppingCart =>

  def calculateApplesToDiscard: Int = {
    throw new NoSuchMethodError()
  }
}
