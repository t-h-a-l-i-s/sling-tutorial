FROM apachesling/sling:latest
MAINTAINER thalis@web.de
EXPOSE 8080 9090
ENV JAVA_OPTS -Xmx512m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9090

