package uk.gov.hmrc.cart

/**
 * User: rgallet
 * Date: 06/10/14 23:38
 */
trait Offers {
  this: ShoppingCart =>

  def calculateApplesToDiscard: Int = {
    val nbApples = products count (_.name == "apple")

    nbApples match {
      case 0 => 0
      case v if v % 2 == 0 =>
        v / 2
      case v if v % 2 == 1 =>
        println("You should buy one more apple to enjoy a free one")
        v / 2
    }
  }

  def calculateOrangesToDiscard = {
    val nbApples = products count (_.name == "orange")

    nbApples match {
      case 0 => 0
      case v if v % 3 == 0 =>
        v / 3
      case v if v % 3 == 1 =>
        println("You should buy one more orange to enjoy a free one")
        v / 3
      case v if v % 3 == 2 =>
        println("You should buy two more orange to enjoy a free one")
        v / 3
    }
  }
}
