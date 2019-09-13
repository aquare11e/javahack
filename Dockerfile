################################################
#             JAVA SPRING IMAGE                #
################################################
FROM fabric8/java-centos-openjdk8-jre

COPY target/javahack-0.0.1.jar /opt

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/javahack-0.0.1.jar"]