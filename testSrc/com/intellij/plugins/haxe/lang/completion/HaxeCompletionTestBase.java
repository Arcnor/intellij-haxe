package com.intellij.plugins.haxe.lang.completion;

import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.openapi.application.PathManager;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.CharFilter;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.testFramework.UsefulTestCase;
import com.intellij.testFramework.fixtures.JavaCodeInsightFixtureTestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Fedor.Korotkov
 */
public abstract class HaxeCompletionTestBase extends JavaCodeInsightFixtureTestCase {
  enum CheckType {EQUALS, INCLUDES, EXCLUDES}

  private final String myPath;

  public HaxeCompletionTestBase(String... path) {
    myPath = getPath(path);
  }

  private static String getPath(String... args) {
    final StringBuilder result = new StringBuilder();
    for (String folder : args) {
      if (result.length() > 0) {
        result.append("/");
      }
      result.append(folder);
    }
    return result.toString();
  }

  @Override
  protected String getTestDataPath() {
    return PathManager.getHomePath() + FileUtil.toSystemDependentName("/plugins/haxe/testData/") + myPath;
  }

  protected void doTest() throws Throwable {
    myFixture.configureByFile(getTestName(false) + ".hx");
    doTestVariantsInner(getTestName(false) + ".txt");
  }

  protected void doTestVariantsInner(String fileName) throws Throwable {
    final VirtualFile virtualFile = myFixture.copyFileToProject(fileName);
    final Scanner in = new Scanner(virtualFile.getInputStream());

    final CompletionType type = CompletionType.valueOf(in.next());
    final int count = in.nextInt();
    final CheckType checkType = CheckType.valueOf(in.next());

    final List<String> variants = new ArrayList<String>();
    while (in.hasNext()) {
      final String variant = StringUtil.strip(in.next(), CharFilter.NOT_WHITESPACE_FILTER);
      if (variant.length() > 0) {
        variants.add(variant);
      }
    }

    myFixture.complete(type, count);
    List<String> stringList = myFixture.getLookupElementStrings();
    assertNotNull(stringList);

    if (checkType == CheckType.EQUALS) {
      UsefulTestCase.assertSameElements(stringList, variants);
    }
    else if (checkType == CheckType.INCLUDES) {
      variants.removeAll(stringList);
      assertTrue("Missing variants: " + variants, variants.isEmpty());
    }
    else if (checkType == CheckType.EXCLUDES) {
      variants.retainAll(stringList);
      assertTrue("Unexpected variants: " + variants, variants.isEmpty());
    }
  }
}
