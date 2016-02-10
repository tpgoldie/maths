package com.tpg.maths.rn.quaternions

class QHat(private val quaternion: Quaternion) extends Quaternion(quaternion.q0, quaternion.q1, quaternion.q2, quaternion.q3) {
}

object QHat {
  def apply(quaternion: Quaternion): QHat = {
    val norm = quaternion.norm
    new QHat(quaternion / norm)
  }
}
