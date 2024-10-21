# BYOPL 24 -- Lox Truffle Implementation 

The Lox implementation is developed as part of the Build Your Own Programming Language course at Software Architecture Group, Hasso Plattner Institute, Potsdam. 

## Getting Started 

See Getting Started section in [BYOPL-2024_Overview](https://1drv.ms/b/s!AosvRVbmrjPTm_YQOBq8GXW3BYNq5A?e=EaAI5S).

For development, you can use Oracle JDK 21, OpenJDK 21, or any of its derivatives.
For best performance use GraalVM for JDK 21 version 21.0.4.

## Maven

To directly use the command line, this might be helpful:


### Compile ...

```bash
./mvnw package
```

### Run Tests

```bash
./mvnw test
```


### Running the main class

```bash
./mvnw exec:java -Dexec.args="-c 'print true;'"
```

### Cleanup

```bash
./mvnw clean
```
