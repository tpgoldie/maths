package com.tpg.maths.rn.quaternions

import org.scalatest.{Matchers, FunSpec}

class QuarternionSpec extends FunSpec with Matchers {
  describe("A quaternion") {
    val q1 = Quaternion(1, -2, 0, -3)

    it ("can add another quaternion") {
      val actual = q1 + Quaternion(-3, 4, 5, 0)
      actual should be(Quaternion(-2, 2, 5, -3))
    }

    it ("can subtract another quaternion") {
      val actual = q1 - Quaternion(-3, 4, 5, 0)
      actual should be(Quaternion(4, -6, -5, -3))
    }

    it ("can be multiplied by a scalar") {
      val actual = q1 * -5.5
      actual should be(Quaternion(-5.5, 11, 0, 16.5))
    }
  }
}
