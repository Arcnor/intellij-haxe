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

import com.intellij.plugins.haxe.openfl.OpenFLBundle;
import com.intellij.util.xml.ConvertContext;
import com.intellij.util.xml.Converter;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;

public class FloatConverter extends Converter<Float> {
  @Nullable
  @Override
  public Float fromString(@Nullable @NonNls String s, ConvertContext context) {
    if (s != null && !s.trim().isEmpty()) {
      try {
        return Float.valueOf(s);
      }
      catch (NumberFormatException e) {
      }
    }
    return null;
  }

  @Nullable
  @Override
  public String toString(@Nullable Float aFloat, ConvertContext context) {
    return aFloat != null ? aFloat.toString() : null;
  }

  @Nullable
  @Override
  public String getErrorMessage(@Nullable String s, ConvertContext context) {
    return OpenFLBundle.message("value.converter.float.exception", s);
  }
}
