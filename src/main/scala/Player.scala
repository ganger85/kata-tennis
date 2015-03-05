/**
 * Created by arincon on 5/03/15.
 */
object Player {
  def apply(name: String) = {new Player(name)}



}

class Player(name: String){
  var score: Int = 0
  def winBall = {score += 1}

}