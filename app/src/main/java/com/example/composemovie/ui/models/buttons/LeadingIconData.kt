package kr.co.fastcampus.part4plus.movieapp.ui.models.buttons

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * 이미지가 들어간 버튼을 위한 이미지 데이터 클래스
 */
data class LeadingIconData(
    @DrawableRes val iconDrawable: Int,
    @StringRes val iconContentDescription: Int?
)
