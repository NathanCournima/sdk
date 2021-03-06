package com.jme3.gde.core.sceneviewer.actions;

import com.jme3.gde.core.scene.SceneApplication;
import com.jme3.gde.core.sceneviewer.SceneViewerTopComponent;
import com.jme3.gde.core.util.CameraUtil.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "SceneComposer",
id = "com.jme3.gde.core.sceneviewer.actions.SwitchLeftViewAction")
@ActionRegistration(displayName = "#CTL_SwitchLeftViewAction")
@ActionReferences({
    @ActionReference(path = "Shortcuts", name = "NUMPAD3")
})
@Messages("CTL_SwitchLeftViewAction=Switch to left view")
public final class SwitchLeftViewAction implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        SceneViewerTopComponent svtc = SceneViewerTopComponent.findInstance();

        if (svtc.hasFocus()) {

            SceneApplication.getApplication().getActiveCameraController().switchToView(View.Left);
        }
    }
}
