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

import com.intellij.openapi.paths.PathReference;
import com.intellij.plugins.haxe.lang.psi.HaxeClass;
import com.intellij.util.xml.Convert;
import com.intellij.util.xml.GenericAttributeValue;
import org.jetbrains.annotations.NotNull;

public interface OpenFLApp extends OpenFLAbstractCondition {
  @NotNull
  GenericAttributeValue<String> getFile();
  @NotNull
  GenericAttributeValue<String> getInit();
  @NotNull
  @Convert(HaxeClassConverter.class)
  GenericAttributeValue<HaxeClass> getMain();
  @NotNull
  GenericAttributeValue<PathReference> getPath();
  @NotNull
  GenericAttributeValue<String> getPreloader();
  @NotNull
  @Convert(FloatConverter.class)
  GenericAttributeValue<Float> getMinSwfVersion();
  @NotNull
  @Convert(FloatConverter.class)
  GenericAttributeValue<Float> getSwfVersion();
  @NotNull
  GenericAttributeValue<String> getUrl();
}
