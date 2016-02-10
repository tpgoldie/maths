package com.tpg.maths.rn.quaternions

import com.tpg.maths.trigonometry.Theta
import com.tpg.maths.trigonometry.Theta._
import org.scalatest.{Matchers, FunSpec}

class QuarternionSpec extends FunSpec with Matchers {
  describe("A quaternion") {
    val q1 = Quaternion(1, -2, 0, -3)

    it("has a string representation") {
      q1.toString should be(s"${q1.q0}J0 - ${q1.q1.abs}J1 + ${q1.q2}J2 - ${q1.q3.abs}J3")
    }

    it("has a basis representation") {
      q1.sbr should be(J0(1), J1(-2), J2(0), J3(-3))
    }

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

    it ("can be multiplied by another quaternion") {
      val actual = q1 * Quaternion(2, -3, 1, 5.5)
      actual should be(Quaternion(12.5, -4, 21, -2.5))
    }

    it ("can have the inner product with another quaternion") {
      val actual = q1 dot Quaternion(2, -3, 1, 5.5)
      actual should be(-8.5)
    }

    it ("can be conjugated") {
      q1.conjugate should be(Quaternion(1, 2, 0, 3))
    }

    it ("has a magnitude") {
      val value = Seq(1, -2, 0, -3).map { i => i * i}
      q1.norm should be(math.pow(value.sum, 0.5))
    }

    it ("has an inverse") {
      val squaresSummed = (Seq(1, -2, 0, -3).map { i => i * i}).sum

      q1.inverse should be(Quaternion(1, 2, 0, 3) / squaresSummed)
    }

    it ("has a real part") {
      q1.re should be(q1.q0)
    }

    it ("has an imaginary part") {
      q1.im should be(q1.q)
    }

    it("generates a unit quaternion corresponding to rotation by angle theta about nHat " +
      "Cayley-Klein parameters") {
      val theta = Theta(math.Pi / 2)
      val r = q1.q

      val actual = Quaternion(theta, r)
      actual.q0 should be(cos(theta / 2))
      actual.q should be(r.nHat * sin(theta / 2))
    }

    it ("has an antisymmetric part on multiplication with another quaternion") {
      val actual = q1.antisym(Quaternion(2, -3, 1, 5.5))
      actual should be(Quaternion(0, 3, 20, -2))
    }

    it ("has a symmetric part on multiplication with another quaternion") {
      val actual = q1.sym(Quaternion(2, -3, 1, 5.5))
      actual should be(Quaternion(12.5, -7, 1, -0.5))
    }
  }
}
