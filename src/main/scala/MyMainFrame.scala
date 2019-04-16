// MainView.scala
package MyMainFrame

import scala.swing._

class MyMainFrame extends MainFrame {
  title = "GUI Program #1"
  preferredSize = new Dimension(320, 240)
  contents = new Label("Here is the contents!")
}
