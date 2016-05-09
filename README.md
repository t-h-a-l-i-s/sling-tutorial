# Sling Tutorial

This is a Sling tutorial introducing the creation of an application using Sightly as rendering engine.

## Set up 

First of all we need a running Sling instance. The easiest way is to use the existing Docker 
image [`apachesling/sling`](https://hub.docker.com/r/apachesling/sling/). For this tutorial
it is assumed that the instance has been successfully started and is listening on port 8080.

For a development cycle it is often necessary to debug services. Because the `apachesling/sling`
image only exposes the default port 8080 and does not start in debug mode, you can
define your own Dockerfile with the follwing content

```
FROM apachesling/sling:latest
MAINTAINER thalis@web.de
EXPOSE 8080 9090
ENV JAVA_OPTS -Xmx512m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9090
```

This uses the latest Apache Sling docker image and exposes both the ports 8080 and 9090.
Port 9090 is the debug port the Sling instance is started with (see `ENV JAVA_OPTS`).

You can build this Docker image by calling

```
docker build -t apachesling/sling-debug .
```

and it can be run for example by calling

```
 docker run -d -p 32771:8080 -p 32772:9090 --name sling-debug apachesling/sling-debug
```

That command starts up the latest Apache Sling in debug mode and binds the process
http port `8080` to the machine's port `32771` and the debug port `9090` to the machine's
port `32772`.

We also need a way to automatically deploy the created content and services by the build process.
There are several ways to deploy but we decided to use an IDE-independent way by using the
[Sling Maven Plugin](https://sling.apache.org/documentation/development/sling.html). To get
a working initial content bundle project up and running quite quickly the existing 
`sling-initial-content-archetype` can be used to do this:

```
mvn archetype:generate -DgroupId=com.github.t-h-a-l-i-s -DartifactId=sling-tutorial 
-DarchetypeGroupId=org.apache.sling -DarchetypeArtifactId=sling-initial-content-archetype
```

