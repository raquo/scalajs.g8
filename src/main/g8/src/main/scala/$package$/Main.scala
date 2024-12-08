package $package$

$if(include_laminar.truthy)$
import com.raquo.laminar.api.L.{*, given}
$endif$
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

$if(include_laminar.truthy)$
$if(include_CSS.truthy)$
@JSImport("@find/**/HelloWorld.less", JSImport.Namespace)
@js.native private object Stylesheet extends js.Object

val _ = Stylesheet // Use import to prevent DCE
$endif$
$endif$

@main def main(): Unit = {
  $if(include_laminar.truthy)$
  renderOnDomContentLoaded(
    container = dom.document.querySelector("#app"),
    rootNode = {
      div(
        cls("Main"),
        h1("Laminar Template"),
        HelloWorld(),
      )
    }
  )
  $else$
  dom.document.querySelector("#app").innerHTML = "Hello from Scala.js!"
  $endif$
}
