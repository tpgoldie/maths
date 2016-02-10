package com.tpg.maths.rn

import org.scalatest.{FunSpec, Matchers}

class RThreeSpec extends FunSpec with Matchers {
  describe("An R3") {
    val v1 = RThree(1, -2, 3)

    it("can be multiplied by a scalar") {
      val actual = v1 * 2.5
      actual should be(RThree(2.5, -5, 7.5))
    }

    it("can be added to another R3 element") {
      val actual = v1 + RThree(-4, 5, 7)
      actual should be(RThree(-3, 3, 10))
    }

    it("can be subtracted from another R3 element") {
      val actual = v1 - RThree(-4, 5, 7)
      actual should be(RThree(5, -7, -4))
    }

    it("the dot product can be taken with another R3 element") {
      val actual = RThree(2, -1, 5) dot RThree(-2, 0, -3)
      actual should be(BigDecimal(-19))
    }

    it("the cross product can be taken with another R3 element") {
      val actual = RThree(2, -1, 5) x RThree(-2, 0, -3)
      actual should be(RThree(3, -4, -2))
    }

    it ("has a norm") {
      val actual = RThree(2, 0, -5).norm
      actual should be(math.pow(29.0, 0.5))
    }

    it ("can be scaled to its unit normal") {
      val actual = RThree(2, 0, -5).nHat
      actual should be(RThree(2, 0, -5) / math.pow(29.0, 0.5))
    }
  }
}
