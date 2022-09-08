import basicmath.BasicMath;
import pattern.Pattern;

public class MainClass {

    public static void main(String[] args){
      // showPatterProgram();
       showBasicMathProgram();
    }

    private static void showBasicMathProgram() {
        BasicMath basicMath = new BasicMath();
        basicMath.countDigit();
        basicMath.reverseDigit();
        basicMath.checkPalindrome();
        basicMath.checkGCD();
        basicMath.checkArmstrong();
        basicMath.printAllDivisior();
    }

    private static void showPatterProgram() {
        Pattern pattern = new Pattern();
        pattern.pyramid();
        pattern.invertedPyramid();
        pattern.triangle();
        pattern.zeroOneTriangle();
        pattern.straightAndInvertTriangle();
        pattern.valuesPrintInTriangle();
        pattern.alphabetsPatternOne();
        pattern.alphabetsPatternTwo();
        pattern.alphabetsPatternThree();
        pattern.alphabetsPyramids();
        pattern.reverseTriangle();
    }
}
