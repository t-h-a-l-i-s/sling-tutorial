# Sling Tutorial

This is a Sling tutorial introducing the creation of an application using Sightly as rendering engine.

## Set up 

First of all we need a running Sling instance. The easiest way is to use the existing Docker 
image [`apachesling/sling`](https://hub.docker.com/r/apachesling/sling/). For this tutorial
it is assumed that the instance has been successfully started and is listening on port 8080.

We also need a way to automatically deploy the created content and services by the build process.
There are several ways to deploy but we decided to use an IDE-independent way by using the
[Sling Maven Plugin](https://sling.apache.org/documentation/development/sling.html). To get
a working initial content bundle project up and running quite quickly the existing 
`sling-initial-content-archetype` can be used to do this:

```
mvn archetype:generate -DgroupId=com.github.t-h-a-l-i-s -DartifactId=sling-tutorial 
-DarchetypeGroupId=org.apache.sling -DarchetypeArtifactId=sling-initial-content-archetype
```

