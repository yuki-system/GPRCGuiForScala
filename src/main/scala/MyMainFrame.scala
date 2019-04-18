// MainView.scala
package MyMainFrame

import scala.swing._

class MyMainFrame extends MainFrame {
  frame =>
  title = "GUI Program #1"
  preferredSize = new Dimension(320, 240)
  contents = new Label("Here is the contents!")
  menuBar = new MenuBar {
    contents += new Menu("ファイル(F)") {
      contents += new MenuItem(Action("新規ウィンドウ(N)") { println("新規ウィンドウ") }) {
        // mnemonic = Key.N
      }
      contents += new MenuItem(Action("終了(X)") {
        frame.dispose()
      }) {
        //menumonic = Key.X
      }
    }
  }
}
