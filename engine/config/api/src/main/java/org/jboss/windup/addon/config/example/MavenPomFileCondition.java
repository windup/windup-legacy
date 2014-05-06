/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.windup.addon.config.example;

import org.jboss.windup.addon.config.selectables.SelectableCondition;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public interface MavenPomFileCondition extends SelectableCondition<MavenPomFile, MavenPomFileCondition>
{

    MavenPomFileCondition withDoctype(String string);

}