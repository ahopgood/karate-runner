package com.hopgood.alexander.intellij.plugins.karate;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.PanelWithAnchor;
import com.intellij.ui.RawCommandLineEditor;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class KarateConfigurable extends SettingsEditor<KarateRunConfiguration> implements PanelWithAnchor {

    private Project myProject;

    private JPanel myPanel;

    private LabeledComponent<ComponentWithBrowseButton> myMainClass;
    private LabeledComponent<RawCommandLineEditor> myGlue;
    private JComponent myAnchor;

    public KarateConfigurable(Project project) {
//        myProject = project;
//        myAnchor = UIUtil.mergeComponentsWithAnchor(myMainClass, myGlue);
    }

    @Override
    protected void resetEditorFrom(@NotNull KarateRunConfiguration configuration) {
//        myMainClass.getComponent().setText(configuration.getMainClassName());
//        myGlue.getComponent().setText(configuration.getPrecalculatedGlue());
    }

    @Override
    protected void applyEditorTo(@NotNull KarateRunConfiguration configuration) throws ConfigurationException {
//        configuration.setMainClassName(myMainClass.getComponent().getText());
//        configuration.setGlue(myGlue.getComponent().getText());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return myPanel;
    }

    private void createUIComponents() {
        myMainClass = new LabeledComponent<>();
        myMainClass.setComponent(new TextFieldWithBrowseButton());
    }

    @Override
    public JComponent getAnchor() {
        return myAnchor;
    }

    @Override
    public void setAnchor(@Nullable JComponent anchor) {
        myAnchor = anchor;
        myMainClass.setAnchor(anchor);
        myGlue.setAnchor(anchor);
    }
}
