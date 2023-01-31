.PHONY: build

build:
	docker build  -f Dockerfile . -t antonnv22/crud:0.1.0

push:
	docker push antonnv22/crud:0.1.0

docker-start:
	docker-compose up -d

newman:
	newman run postman/collection.json