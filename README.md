# springboot-camel-openshift-maven-archetype

A maven archetype for initializing a Springboot Camel application, with resources that facilitate continuous delivery to Openshift.

## Usage

### mvn archetype:generate

```
$ mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeGroupId=adrianjuhl.archetype \
    -DarchetypeArtifactId=springboot-camel-openshift-archetype \
    -DarchetypeVersion=<archetype version> \
    -DgroupId=my.group.id \
    -DartifactId=my-springboot-camel-app \
    -Dversion=1.0.0-SNAPSHOT
```

# License

MIT

# Author

[Adrian Juhl](http://github.com/adrianjuhl)

# Source Code

[https://github.com/adrianjuhl/springboot-camel-openshift-maven-archetype](https://github.com/adrianjuhl/springboot-camel-openshift-maven-archetype)
