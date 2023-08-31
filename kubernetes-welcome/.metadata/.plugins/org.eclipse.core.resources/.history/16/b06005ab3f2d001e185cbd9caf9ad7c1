FROM openjdk:17
ADD target/replicasetdemo.jar rsdemo.jar
ENV kubernetes_pod_id=folks
ENTRYPOINT ["java","-jar","-Dkubernetes.pod.id=${kubernetes_pod_id}","rsdemo.jar"]
#CMD ["java", "-jar", "-Dapp.version=${APP_VERSION_ENV}", "/app/app.jar"]
