# Docker image for arthas tunnel server
# VERSION 0.0.1
# Author: oliver

### 基础镜像
FROM paperinik/rpi-java8

#作者
MAINTAINER Oliver <176514610@qq.com>

ADD jarfiles/arthas-tunnel-server-3.4.3.jar arthas-tunnel-server.jar

ENTRYPOINT ["java", "-jar","-XX:MetaspaceSize=128m","-XX:MaxMetaspaceSize=56m","-Xms128m","-Xmx128m","-Xmn32m","-Xss256k","-XX:SurvivorRatio=8","-XX:+UseConcMarkSweepGC", "-Dspring.profiles.active=prod","/var/java/arthas-tunnel-server.jar"]

#暴露8080端口
EXPOSE 8080
