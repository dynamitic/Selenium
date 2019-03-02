FROM selenium/standalone-chrome

USER root

RUN apt update && apt install -y default-jdk maven

WORKDIR /data

COPY ./ ./

RUN mvn compile

CMD /opt/bin/entry_point.sh  & \
    mvn test