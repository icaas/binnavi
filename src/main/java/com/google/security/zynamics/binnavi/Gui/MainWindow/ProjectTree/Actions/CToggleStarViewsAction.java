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
package com.google.security.zynamics.binnavi.Gui.MainWindow.ProjectTree.Actions;



import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.google.security.zynamics.binnavi.Gui.MainWindow.Implementations.CViewFunctions;
import com.google.security.zynamics.binnavi.disassembly.views.INaviView;


/**
 * Action class used for toggling the star state of views.
 */
public class CToggleStarViewsAction extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 8887245095206557322L;

  /**
   * Parent window used for dialogs.
   */
  private final Window m_parent;

  /**
   * The views whose star state is toggled.
   */
  private final INaviView[] m_views;

  /**
   * Creates a new action object.
   * 
   * @param parent Parent window used for dialogs.
   * @param views The views whose star state is toggled.
   */
  public CToggleStarViewsAction(final Window parent, final INaviView[] views) {
    super("Toggle view stars");

    m_parent = parent;
    m_views = views.clone();
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    CViewFunctions.toggleStars(m_parent, m_views);
  }
}
