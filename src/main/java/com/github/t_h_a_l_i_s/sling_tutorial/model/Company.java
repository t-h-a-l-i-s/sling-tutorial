package com.github.t_h_a_l_i_s.sling_tutorial.model;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by thalis on 07.05.16.
 */
@Model(adaptables = Resource.class)
public class Company {

    @Self
    private Resource self;

    @Inject
    private String title;

    private String name;

    @PostConstruct
    protected void setName() {
        this.name = this.self.getName();
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return this.name;
    }
}
