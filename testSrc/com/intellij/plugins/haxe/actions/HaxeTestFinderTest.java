package com.intellij.plugins.haxe.actions;

import com.intellij.plugins.haxe.HaxeCodeInsightFixtureTestCase;
import com.intellij.plugins.haxe.HaxeFileType;
import com.intellij.plugins.haxe.ide.HaxeTestFinder;
import com.intellij.psi.PsiFile;

/**
 * @author: Fedor.Korotkov
 */
public class HaxeTestFinderTest extends HaxeCodeInsightFixtureTestCase {
  private HaxeTestFinder myTestFinder = null;

  @Override
  protected String getBasePath() {
    return "/testFinder/";
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    myTestFinder = new HaxeTestFinder();
  }

  private void doFindTestsTest(int i) {
    doFindTestsTest(myFixture.configureByFiles(getTestName(false) + "." + HaxeFileType.DEFAULT_EXTENSION), 1);
  }

  private void doFindTestsTest(PsiFile[] files, int size) {
    assertEquals(size, myTestFinder.findTestsForClass(myFixture.getElementAtCaret()).size());
  }

  private void doFindClassesTest(int i) {
    doFindClassesTest(myFixture.configureByFiles(getTestName(false) + "." + HaxeFileType.DEFAULT_EXTENSION), 1);
  }

  private void doFindClassesTest(PsiFile[] files, int size) {
    assertEquals(size, myTestFinder.findClassesForTest(myFixture.getElementAtCaret()).size());
  }

  public void testFoo1() throws Throwable {
    doFindTestsTest(1);
  }

  public void testFoo2() throws Throwable {
    doFindTestsTest(1);
  }

  public void testFoo3() throws Throwable {
    doFindTestsTest(myFixture.configureByFiles(
      "Foo3.hx",
      "test/Foo3Test.hx",
      "test/TestFoo3.hx"
    ), 2);
  }

  public void testFoo4Test() throws Throwable {
    doFindClassesTest(1);
  }

  public void testFoo5Test() throws Throwable {
    doFindClassesTest(1);
  }
}
