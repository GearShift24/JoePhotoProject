package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Joseph Wrigley 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
	  public static void testKeepOnlyBlue()
	  {
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
	  }
	  
	  public static void testMirrorDiagonalTopLeftToBottomRight()
	  {
		  Picture barbaraS = new Picture("seagull.jpg");
		  barbaraS.mirrorDiagonalTopLeftToBottomRight();
		  barbaraS.explore();
	  }
	  
	  public static void testMirrorDiagonal()
	  {
	    Picture motorCycle = new Picture("blueMotorcycle.jpg");
	    motorCycle.mirrorDiagonal();
	    motorCycle.explore();
	  }
	  
	  public static void testNegate()
	  {
		   Picture beach = new Picture("beach.jpg");
		    beach.explore();
		    beach.negate();
		    beach.explore();
	  }
	  
	  
	  
	  public static void testStatic()
	  {
		   Picture beach = new Picture("beach.jpg");
		    beach.explore();
		    beach.staticYe();
		    beach.explore();
	  }
	  
	  public static void testFixUnderwater()
	  {
		   Picture beach = new Picture("water.jpg");
		    beach.explore();
		    beach.fixUnderwater();
		    beach.explore();
	  }
	  
	  
	  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture koala = new Picture("barbaraS.jpg");
	  koala.explore();
	  koala.mirrorVerticalRightToLeft();
	  koala.keepOnlyBlue();
	  koala.mirrorDiagonalTopLeftToBottomRight();
	  koala.mirrorHorizontalBottomToTop();
	  koala.fixUnderwater();
	  koala.explore();
	
  }
  
  
  public static void testMirrorBottomToTop()
  {
	  Picture dumb = new Picture("barbaraS.jpg");
	  dumb.mirrorHorizontalBottomToTop();
	  dumb.explore();
  }
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();

  }
  
  
  public static void testSeagull()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.mirrorSeagull();
	  seagull.explore();
  }
  
  public static void testSnowman()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.mirrorSnowman();
	  snowman.explore();
  }
  
  public static void testChosenCopy()
  {
	  Picture blueMotorcycle = new Picture ("blueMotorcycle.jpg");
	  blueMotorcycle.chosenCopy(blueMotorcycle, 10, 200);
	  blueMotorcycle.explore();
  }
  
  public static void testGlitch()
  {
	  Picture cycle = new Picture ("blueMotorcycle.jpg");
	  cycle.glitch(cycle, (int)(Math.random() * 470), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  
	  cycle.glitch(cycle, (int)(Math.random() * 470), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));  cycle.glitch(cycle, (int)(Math.random() * 470), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));  cycle.glitch(cycle, (int)(Math.random() * 470), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));  cycle.glitch(cycle, (int)(Math.random() * 470), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));  cycle.glitch(cycle, (int)(Math.random() * 470), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));  cycle.glitch(cycle, (int)(Math.random() * 470), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  cycle.glitch(cycle, (int)(Math.random() * 460), (int)(Math.random() * 450));
	  
	   cycle.explore();
  }
  
  
  public static void testStegano()
  {
	  Picture yo = new Picture("greenMan.jpg");
	  yo.Stegano();
	  yo.explore();
  }
  
  
   
  public static void testValentines()
  {
	  Picture me = new Picture("han.jpeg");
	  me.valentines();
	  me.explore();
  }
  
  public static void testChroma()
  {
	  Picture kek = new Picture("wall.jpg");
	  Picture message = new Picture("message.jpg");
	  kek.Chroma(message);
	  kek.explore();
	  message.Decode();
	  
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  testStegano();
	  testChroma();

//	  testValentines();
//    testZeroBlue();
//	  testSnowman();
//	  testSeagull();
//    testKeepOnlyBlue();
//    testNegate();
//    testStatic();
//    testFixUnderwater();
//	  testMirrorDiagonal();
//	  testMirrorDiagonalTopLeftToBottomRight();
    //testKeepOnlyBlue();
//	  testFlipSeagull(); 
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//    testMirrorBottomToTop();
//    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
//	  testGlitch();
//    testCollage();
//    testChosenCopy();
    //testCopy();
//    testEdgeDetection();
//    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}