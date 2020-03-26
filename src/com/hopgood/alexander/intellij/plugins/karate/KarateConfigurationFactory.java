package com.hopgood.alexander.intellij.plugins.karate;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class KarateConfigurationFactory extends ConfigurationFactory {

    private static final String FACTORY_NAME = "Karate Run Configuration Factory";
    private static final String TEMPLATE_NAME = "Karate Template";

    protected KarateConfigurationFactory(@NotNull ConfigurationType type) {
        super(type);
    }

    @NotNull
    @Override
    public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new KarateRunConfiguration(project, this, TEMPLATE_NAME);
    }

    @Override
    public String getName() {
        return FACTORY_NAME;
    }
}
