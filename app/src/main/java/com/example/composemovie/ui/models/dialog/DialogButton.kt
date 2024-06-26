package com.example.composemovie.ui.models.dialog

import kr.co.fastcampus.part4plus.movieapp.ui.models.buttons.LeadingIconData

/**
 * 팝업에 들어갈 버튼에 대한 구분 클래스
 */
sealed class DialogButton(
    open val title: String,
    open val action: (() -> Unit)?
) {
    data class Primary(
        override val title: String,
        val leadingIconData: LeadingIconData? = null,
        override val action: (() -> Unit)? = null
    ) : DialogButton(title, action)

    data class Secondary(
        override val title: String,
        override val action: (() -> Unit)? = null
    ) : DialogButton(title, action)

    data class UnderlinedText(
        override val title: String,
        override val action: (() -> Unit)? = null
    ) : DialogButton(title, action)

    data class SecondaryBorderless(
        override val title: String,
        override val action: (() -> Unit)? = null
    ) : DialogButton(title, action)
}
