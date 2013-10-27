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

import com.intellij.plugins.haxe.lang.psi.HaxeClass;
import com.intellij.plugins.haxe.util.HaxeResolveUtil;
import com.intellij.util.xml.ConvertContext;
import com.intellij.util.xml.Converter;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;

public class HaxeClassConverter extends Converter<HaxeClass> {
  @Nullable
  @Override
  public HaxeClass fromString(@Nullable @NonNls String s, ConvertContext context) {
    return HaxeResolveUtil.findClassByQName(s, context.getReferenceXmlElement());
  }

  @Nullable
  @Override
  public String toString(@Nullable HaxeClass aClass, ConvertContext context) {
    return aClass != null ? aClass.getQualifiedName() : null;
  }
}
