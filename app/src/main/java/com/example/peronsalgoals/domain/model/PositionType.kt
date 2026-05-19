package com.example.peronsalgoals.domain.model

enum class PositionType(val index: Int) {
    Unknown(-1),
    CenterForward(0),
    LeftWinger(1),
    AttackingCenterMid(2),
    RightWinger(3),
    CenterMidFielder(4),
    DefensiveCenterMid(5),
    LeftOutsideBack(6),
    LeftCenterBack(7),
    RightCenterBack(8),
    RightOutsideBack(9);

    companion object {
        private val byIndex: Map<Int, PositionType> = entries.associateBy { it.index }

        fun fromInt(value: Int): PositionType {
            return byIndex[value] ?: Unknown
        }
    }
}