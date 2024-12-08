package $package$

import com.raquo.laminar.api.L.{*, given}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object HelloWorld {

  $if(include_CSS.truthy)$
  @JSImport("@find/**/HelloWorld.less", JSImport.Namespace)
  @js.native private object Stylesheet extends js.Object

  val _ = Stylesheet // Use import to prevent DCE
  $endif$

  def apply(): HtmlElement = {
    val nameVar = Var(initial = "world")
    div(
      cls("HelloWorld"),
      label("Your name: "),
      input(
        onMountFocus,
        placeholder := "Enter your name here",
        onInput.mapToValue --> nameVar
      ),
      div(
        cls("-greeting"),
        "Hello, ",
        text <-- nameVar.signal.map(_.toUpperCase)
      )
    )
  }
}
