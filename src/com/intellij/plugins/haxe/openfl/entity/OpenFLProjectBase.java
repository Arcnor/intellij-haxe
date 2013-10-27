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
package com.intellij.plugins.haxe.openfl.entity;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.Required;
import org.jetbrains.annotations.NotNull;

public interface OpenFLProjectBase extends DomElement {
  @NotNull
  @Required
  OpenFLMeta getMeta();

  @NotNull
  @Required
  OpenFLApp getApp();

  @NotNull
  OpenFLWindow getWindow();

  @NotNull
  OpenFLIcon getIcon();

  @NotNull
  OpenFLAssets getAssets();

  @NotNull
  OpenFLCertificate getCertificate();

  @NotNull
  OpenFLSource getSource();

  @NotNull
  OpenFLHaxelib getHaxelib();
}
