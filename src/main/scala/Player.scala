object Player {
  def apply(name: String) = {new Player(name)}



}

class Player(name: String){
  val noun: String = name

  var score: Int = 0

  def winBall() = {
    score += 1
  }

}