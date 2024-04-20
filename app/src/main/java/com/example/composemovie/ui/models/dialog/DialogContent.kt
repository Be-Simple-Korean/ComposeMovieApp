package com.example.composemovie.ui.models.dialog

/**
 * 팝업에 들어갈 내용에 대한 구분 클래스
 */
sealed class DialogContent {
    data class Default(
        val dialogText: DialogText.Default
    ) : DialogContent()

    data class Large(
        val dialogText: DialogText.Default
    ) : DialogContent()

    data class Rating(
        val dialogText: DialogText.Rating
    ) : DialogContent()
}
