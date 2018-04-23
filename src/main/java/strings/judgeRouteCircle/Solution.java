package strings.judgeRouteCircle;

/**
 * 657. Judge Route Circle
 * <p>
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle,
 * which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are
 * R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes
 * a circle.
 * <p>
 * Example 1:
 * Input: "UD"
 * Output: true
 * <p>
 * Example 2:
 * Input: "LL"
 * Output: false
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int w = 0, h = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U')
                h++;
            else if (moves.charAt(i) == 'D')
                h--;
            else if (moves.charAt(i) == 'L')
                w--;
            else if (moves.charAt(i) == 'R')
                w++;
        }
        return w == 0 && h == 0;
    }
}
