FROM centos:7
ENV RELEASE_PATH target/my-example-swarm.jar
RUN yum install -y \
    java-1.8.0-openjdk-headless \
  && yum clean all

WORKDIR /opt/my-example

ADD ${RELEASE_PATH} /opt/my-example

RUN groupadd -r duser -g 1001 \
    && useradd -u 1001 -r -g duser -d /opt/my-example/ -s /sbin/nologin -c "Docker image user" duser \
    && chown -R duser:duser /opt/my-example/ \
    && chgrp -R 0 /opt/my-example && chmod -R g=u /opt/my-example

USER 1001


EXPOSE 8080

ENV PORT_OFFSET=0
ENV LOGGING_LEVEL=INFO

CMD java -jar /opt/my-example/my-example-swarm.jar \
    -Dswarm.port.offset=${PORT_OFFSET} \
    -Dswarm.logging=${LOGGING_LEVEL}
