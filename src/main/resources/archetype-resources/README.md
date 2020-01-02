#set($hash = '#')
${hash} ${artifactId}

TODO [add some information about this project here]



${hash}${hash} Running the application

Run with spring-boot:run

```
$ mvn spring-boot:run -DSPRING_APPLICATION_JSON='{"cxf.path":"/api","logging.level.${package}":"DEBUG"}'
```

... or package and run (use current project version in jar name)

```
$ mvn clean package
$ java -DSPRING_APPLICATION_JSON='{"cxf.path":"/api","logging.level.${package}":"DEBUG"}' -jar target/${artifactId}-<version>.jar
```

${hash}${hash} Verify

Verify locally

```
$ curl http://127.0.0.1:8080/api/readinessprobe
```

${hash}${hash} Deploy kickstart pipeline to OpenShift

```
# From root directory of repo:
$ ./cicd/deploy-kickstart-pipeline.sh --application-name <app-name> --source-repo-git-uri <source-repo-uri> --openshift-url <openshift-url> --jenkins-build-namespace <build-namespace>
```

Start the kickstart pipeline

```
$ oc start-build <app-name>-kickstart --namespace <build-namespace>
```

${hash} Author Information

See the commit history.

${hash} Source Code

TODO [add source code repository URL here]
