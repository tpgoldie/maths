package com.tpg.maths.vectors

case class CrossProduct(a: Vector, b: Vector) {
  lazy val crossProduct: Option[Vector] = (a.dimension == 3) && (b.dimension == 3) match {
    case true => {
      val c0 = a.at(1) * b.at(2) - a.at(2) * b.at(1)
      val c1 = a.at(2) * b.at(0) - a.at(0) * b.at(2)
      val c2 = a.at(0) * b.at(1) - a.at(1) * b.at(0)

      Some(Vector(c0, c1, c2))
    }

    case false => None
  }
}
