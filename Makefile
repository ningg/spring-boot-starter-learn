test:
	mvn test -U

install:
	mvn clean install -DskipTests

deploy:
	mvn clean deploy -DskipTests