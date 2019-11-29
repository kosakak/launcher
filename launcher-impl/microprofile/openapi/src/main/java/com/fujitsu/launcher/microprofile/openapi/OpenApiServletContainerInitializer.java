/*
 * Copyright (c) 2019 Fujitsu Limited and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.fujitsu.launcher.microprofile.openapi;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 
 * @author Takahiro Nagao
 */
public class OpenApiServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> classes, ServletContext context) throws ServletException {
        ServletRegistration.Dynamic dynamic = context.addServlet("openapi-servlet", OpenApiServlet.class);
        dynamic.addMapping("/openapi");
     }
}
