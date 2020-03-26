package com.hopgood.alexander.intellij.plugins.karate;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.icons.AllIcons;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class KarateRunConfigurationType implements ConfigurationType {
    private static final String NAME = "Karate";
    private static final String DESCRIPTION = "A Karate Run Template";
    private static final String ID = "KARATE_RUN_CONFIGURATION";

    @NotNull
    @Override
    public String getDisplayName() {
        return NAME;
    }

    @Nls
    @Override
    public String getConfigurationTypeDescription() {
        return DESCRIPTION;
    }

    @Override
    public Icon getIcon() {
        return AllIcons.General.Information;
    }

    @NotNull
    @Override
    public String getId() {
        return ID;
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{ new KarateConfigurationFactory(this) };
    }
}
