package com.github.t_h_a_l_i_s.sling_tutorial.components.page;

/*
  Licensed to the Apache Software Foundation (ASF) under one
  or more contributor license agreements.  See the NOTICE file
  distributed with this work for additional information
  regarding copyright ownership.  The ASF licenses this file
  to you under the Apache License, Version 2.0 (the
  "License"); you may not use this file except in compliance
  with the License.  You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing,
  software distributed under the License is distributed on an
  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  KIND, either express or implied.  See the License for the
  specific language governing permissions and limitations
  under the License.
*/

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.scripting.SlingScriptHelper;
import org.apache.sling.scripting.sightly.pojo.Use;

import javax.script.Bindings;

/**
 * Created by thalis on 07.05.16.
 */
public class BasePage implements Use {

    protected static final String DC_TITLE_PROPERTY = "title";
    protected static final String DC_LANGUAGE_PROPERTY = "language";

    private static final String DEFAULT_TITLE = "Untitled";
    private static final String DEFAULT_LANGUAGE = "en";

    private String title;

    private String language;

    private Boolean isUserLoggedIn;

    private String userName;

    private SlingScriptHelper sling;

    @Override
    public void init(final Bindings bindings) {
        final ValueMap properties = (ValueMap) bindings.get("properties");
        this.title = StringUtils.defaultIfBlank(properties.get(DC_TITLE_PROPERTY, String.class), DEFAULT_TITLE);
        this.language = StringUtils.defaultIfBlank(properties.get(DC_LANGUAGE_PROPERTY, String.class),
                DEFAULT_LANGUAGE);
        this.sling = (SlingScriptHelper) bindings.get("sling");
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isUserLoggedIn() {
        this.isUserLoggedIn = true;
        return isUserLoggedIn;
    }

    public String getUserName() {
        this.userName = "TestUser";
        return this.userName;
    }


}
