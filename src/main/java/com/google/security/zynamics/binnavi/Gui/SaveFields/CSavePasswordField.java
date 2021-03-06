/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.SaveFields;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPasswordField;

/**
 * Password field that shows a different background depending on its modification state.
 */
public class CSavePasswordField extends JPasswordField {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 824726793557383107L;

  /**
   * Shows a modified background in case input to the field changed.
   */
  private final CSaveFieldBackground m_background = new CSaveFieldBackground();

  /**
   * Flag that indicates whether input to the field changed.
   */
  private boolean m_modified = false;

  /**
   * Creates a new password field.
   * 
   * @param text Default text.
   * @param columns Number of columns.
   */
  public CSavePasswordField(final String text, final int columns) {
    super(text, columns);
  }

  @Override
  public void paintComponent(final Graphics graphics) {
    setOpaque(!m_modified);

    if (m_modified) {
      m_background.paint((Graphics2D) graphics, getWidth(), getHeight());
    }

    super.paintComponent(graphics);
  }

  /**
   * Sets the modification state of the field.
   * 
   * @param modified The modification state of the field.
   */
  public void setModified(final boolean modified) {
    m_modified = modified;
  }
}
