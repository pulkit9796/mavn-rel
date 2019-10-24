FROM C:\Users\pulkit mittal\eclipse-workspace\mavn-rel

RUN yum install java-1.8.0-openjdk-devel -y

COPY ./target/prop-0.0.2-SNAPSHOT.jar /

CMD /bin/bash

ENTRYPOINT["java","-jar","/prop-0.0.2-SNAPSHOT.jar"]