/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.plugins.haxe.openfl;

import com.intellij.lang.documentation.DocumentationProviderEx;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.xml.XmlElementDeclImpl;
import com.intellij.psi.impl.source.xml.XmlFileImpl;
import org.jetbrains.annotations.Nullable;

public class OpenFLProjectDocProvider extends DocumentationProviderEx {
  @Override
  public String generateDoc(PsiElement element, @Nullable PsiElement originalElement) {
    if (element instanceof XmlFileImpl) {
      return "The <pre>project.xml</pre> file, used by OpenFL to configure your project";
    } else if (element instanceof XmlElementDeclImpl) {
      if ("haxelib".equalsIgnoreCase(((XmlElementDeclImpl)element).getName())) {
        return "<p>Use \"haxelib\" tags to include Haxe libraries:</p>" +
               "<pre>" +
               "<code>&lt;<font color='blue'>haxelib</font> <font color='red'>name</font>=<font color='green'>\"actuate\"</font> /&gt;</code>\n" +
               "</pre>" +
               "<p>You can also specify a version, if you prefer:</p>" +
               "<br/>" +
               "<code><haxelib name=\"actuate\" version=\"1.0.0\" /></code>";
      }
    }
    return null;
  }
}
