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

import com.intellij.openapi.util.Iconable;
import com.intellij.plugins.haxe.openfl.entity.OpenFLProjectBase;
import com.intellij.util.xml.DomFileDescription;
import icons.HaxeIcons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class OpenFLProjectDomFileDescription extends DomFileDescription<OpenFLProjectBase> {
  public OpenFLProjectDomFileDescription() {
    super(OpenFLProjectBase.class, "project");
  }

  @Nullable
  @Override
  public Icon getFileIcon(@Iconable.IconFlags int flags) {
    return HaxeIcons.OpenFL_16;
  }
}
