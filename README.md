## Project Description
Proof of concept of two WAR builds sharing a common jar that exposes webservice end points.

## Prerequisites
* Docker - Run scripts (run.sh) starts a docker container.
* Java 8

## The Web Service Endpoints
The web service endpoints is provided by the _war-dep1_ module.

* /greet/json - Returns a json response
* /greet/xml - Returns an xml response

## WAR Build Number 1: Rest Easy
The _war-resteasy_ module exposes the web service endpoints using RestEasy Framework.

### Build
```bash
./gradlew war-resteasy:war
```
### Run
```bash
cd war-resteasy
./run.sh
```

### Test
```
http://localhost:8080/war-resteasy/rest/greet/json
http://localhost:8080/war-resteasy/rest/greet/xml
```

## WAR Build Number 2: CXF
The _war-cxf_ module exposes the web service endpoints using Apache CXF Framework

### Build
```bash
./gradlew war-cxf:war
```
### Run
```bash
cd war-cxf
./run.sh
```

### Test
```
http://localhost:8080/war-cxf/rest/greet/json
http://localhost:8080/war-cxf/rest/greet/xml
```
