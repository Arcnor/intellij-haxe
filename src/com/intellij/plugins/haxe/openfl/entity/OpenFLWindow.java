/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http();
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.plugins.haxe.openfl.entity;

import com.intellij.util.xml.GenericAttributeValue;
import org.jetbrains.annotations.NotNull;

public interface OpenFLWindow extends OpenFLAbstractCondition {
  @NotNull
  GenericAttributeValue<Integer> getWidth();
  @NotNull
  GenericAttributeValue<Integer> getHeight();
  @NotNull
  GenericAttributeValue<Integer> getBackground();
  @NotNull
  GenericAttributeValue<String> getParameters();
  @NotNull
  GenericAttributeValue<Integer> getFps();
  @NotNull
  GenericAttributeValue<Boolean> getHardware();
  @NotNull
  GenericAttributeValue<Boolean> getResizable();
  @NotNull
  GenericAttributeValue<Boolean> getBorderless();
  @NotNull
  GenericAttributeValue<Boolean> getVsync();
  @NotNull
  GenericAttributeValue<Boolean> getFullscreen();
  @NotNull
  GenericAttributeValue<Integer> getAntialiasing();
  @NotNull
  GenericAttributeValue<OpenFLAttrOrientation> getOrientation();
  @NotNull
  GenericAttributeValue<Boolean> getAllowShaders();
  @NotNull
  GenericAttributeValue<Boolean> getRequireShaders();
  @NotNull
  GenericAttributeValue<Boolean> getDepthBuffer();
  @NotNull
  GenericAttributeValue<Boolean> getStencilBuffer();
}
