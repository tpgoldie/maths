package com.tpg.maths.vectors

import com.tpg.maths.vectors.i._
import com.tpg.maths.vectors.j._
import com.tpg.maths.vectors.k._

import org.scalatest.{Matchers, FunSpec}

class VectorSpec extends FunSpec with Matchers {
  describe("a vector") {
    val v1 = Vector(2, -3, 8)

    it("can be added to another of the same dimension") {
      val actual = v1 + Vector(-1, 0, -5)
      actual should be (Some(Vector(1, -3, 3)))
    }

    it("cannot be added to another vector of a different dimension") {
      val actual = v1 + Vector(-1, 0, -5, 4)
      actual should be (None)
    }

    it("can be subtracted from another of the same dimension") {
      val actual = Vector(-1, 0, -5) - v1
      actual should be (Some(Vector(-3, 3, -13)))
    }

    it("cannot be subtracted from another of a different dimension") {
      val actual = Vector(-1, 0, -5, 1) - v1
      actual should be (None)
    }

    it("can be multiplied by a scalar") {
      val actual = Vector(-1, 0, 5) * 4.5
      actual should be (Vector(-4.5, 0, 5 * 4.5))
    }

    it("has a standard basis representation for vectors in R3") {
      v1.sbr should be((toI(2), toJ(-3), toK(8)))
    }
  }
}
