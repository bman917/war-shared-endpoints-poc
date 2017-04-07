package com.wartemp;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * RESTEasy Application
 */
@ApplicationScoped
@ApplicationPath("/rest/")
public class RESTEasyApplication extends Application
{

}