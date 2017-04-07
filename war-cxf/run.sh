#!/bin/bash
docker run --rm -v `pwd`/build/libs:/usr/local/tomcat/webapps -p 8080:8080 tomcat:9.0
