package com.tpg.maths.trigonometry

case class Theta(value: BigDecimal) {
  lazy val sin = math.sin(value.doubleValue)
  lazy val cos = math.cos(value.doubleValue)
  lazy val tan = math.tan(value.doubleValue)

  def /(factor: BigDecimal): Option[Theta] = factor == 0 match {
    case true => None
    case false => Some(Theta(value / factor))
  }
}

object Theta {
  def sin(theta: Theta) = theta.sin

  def sin(theta: Option[Theta]) = theta match {
    case Some(t) => t.sin
    case None => 0.0
  }

  def cos(theta: Theta) = theta.cos

  def cos(theta: Option[Theta]) = theta match {
    case Some(t) => t.cos
    case None => 0.0
  }
}
