package org.rembx.jeeshop.admin;

import org.rembx.jeeshop.catalog.*;
import org.rembx.jeeshop.media.Medias;
import org.rembx.jeeshop.user.Newsletters;
import org.rembx.jeeshop.user.Users;
import org.rembx.jeeshop.user.model.Newsletter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rs")
public class
        ApplicationConfig extends Application {

    // ======================================
    // =          Business methods          =
    // ======================================

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(Catalogs.class);
        classes.add(Categories.class);
        classes.add(Products.class);
        classes.add(SKUs.class);
        classes.add(Discounts.class);
        classes.add(Users.class);
        classes.add(Medias.class);
        classes.add(Newsletters.class);
        return classes;
    }
}
