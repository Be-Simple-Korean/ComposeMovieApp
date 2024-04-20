# FastCampus(온라인 강의) Compose Movie App
* 사용 기술
  * Android Navigation
  * Compose
  * Retrofit
  * Hilt
  * MVVM
* 팝업 구조화
  * BaseDialogPopup
    - 팝업을 띄우기 위한 컴포저블 함수
    - DialogTitle(Sealed Class)
    - DialogContent(Sealed Class)
    - DialogButton(Sealed Class)
    - 각 3가지의 sealed class에 대한 Wrapper class를 만들어서 하위의 세부 컴포저블 함수로 팝업에 표시
    - 유형은 Deafult, Alert, Rating 세가지로 나눔
    - ex)
     ```Kotlin
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

      @Composable
      fun DialogPopup.Default(
        title: String,
        bodyText: String,
        buttons: List<DialogButton>
      ) {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Default(title),
            dialogContent = DialogContent.Default(
                DialogText.Default(bodyText)
            ),
            buttons = buttons
        )
      }
     ```
