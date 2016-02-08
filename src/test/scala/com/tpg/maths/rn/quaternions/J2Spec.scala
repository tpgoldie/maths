package com.tpg.maths.rn.quaternions

import org.scalatest.{Matchers, FunSpec}

class J2Spec extends FunSpec with Matchers {
  describe("A J2 basis element") {
    it("can be multiplied by itself") {
      val actual = J2 * J2
      actual should be (J0(-1))
    }

    it("can be multiplied by J0") {
      val actual = J2 * J0
      actual should be (J2)
    }

    it("can be multiplied by J1") {
      val actual = J2 * J1
      actual should be (J3(-1))
    }
  }
}
