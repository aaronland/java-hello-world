# java-hello-world

Because Java is still a world of crazy talk, for me.

## Build

This uses [Maven](https://maven.apache.org/) to manage dependencies and to build packages. Choose your poison, right?

```
mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building helloworld 0.0.1
[INFO] ------------------------------------------------------------------------

... Java stuff happens

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.132 s
[INFO] Finished at: 2018-06-27T03:45:24+00:00
[INFO] Final Memory: 19M/209M
[INFO] ------------------------------------------------------------------------
```

## Usage

```
$> java -jar ./target/helloworld-0.0.1.jar -h
usage: hello world
 -h,--help
 -n,--name <arg>   name

$> java -jar ./target/helloworld-0.0.1.jar -n
Unexpected exception:Missing argument for option: n

$> java -jar ./target/helloworld-0.0.1.jar -n ""
Invalid name

$> java -jar ./target/helloworld-0.0.1.jar -n 'java mcjavaface'
Hello World 'Java Mcjavaface'
```

## See also

* https://commons.apache.org/proper/commons-cli
* https://commons.apache.org/proper/commons-lang
