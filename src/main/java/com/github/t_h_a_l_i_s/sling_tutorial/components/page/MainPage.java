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

import com.github.t_h_a_l_i_s.sling_tutorial.model.Company;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.script.Bindings;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by thalis on 07.05.16.
 */
@Model(adaptables = Resource.class)
public class MainPage extends BasePage {

    private List<Company> companies = new LinkedList<>();

    public List<Company> getCompanies() {
        return companies;
    }
}
