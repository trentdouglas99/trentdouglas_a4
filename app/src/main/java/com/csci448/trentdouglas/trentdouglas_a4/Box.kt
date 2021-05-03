package com.csci448.trentdouglas.trentdouglas_a4

import android.graphics.PointF

class Box(val start: PointF, var end: PointF) {
    val left: Float
        get() = Math.min(start.x, end.x)
    val right: Float
        get() = Math.max(start.x, end.x)
    val top: Float
        get() = Math.min(start.y, end.y)
    val bottom: Float
        get() = Math.max(start.y, end.y)

}