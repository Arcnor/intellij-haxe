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

import com.intellij.util.xml.NamedEnum;

public enum OpenFLAttrAssetType implements NamedEnum {
  BINARY("binary"),
  FONT("font"),
  IMAGE("image"),
  MOVIE_CLIP("movie_clip"), // FIXME: not sure about this one...
  MUSIC("music"),
  SOUND("sound"),
  TEMPLATE("template"),
  TEXT("text");

  private final String value;
  private OpenFLAttrAssetType(String value) {
    this.value = value;
  }

  @Override
  public String getValue() {
    return null;
  }
}
