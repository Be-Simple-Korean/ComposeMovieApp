package com.example.composemovie.ui.models.dialog


/**
 * 팝업의 헤더에 대한 구분 클래스
 */
sealed class DialogTitle(
    open val text: String
) {
    data class Default(
        override val text: String
    ) : DialogTitle(text)

    data class Header(
        override val text: String
    ) : DialogTitle(text)

    data class Large(
        override val text: String
    ) : DialogTitle(text)
}
