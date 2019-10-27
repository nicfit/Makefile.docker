include ../Makefile.docker

bash: start
	docker-compose exec nicfit-alpine bash

publish:
	for img in alpine-base alpine-python alpine-java alpine-devel alpine; do \
		docker tag nicfit/$${img}:latest nicfit/$${img}:${VERSION};\
		docker push nicfit/$${img}:${VERSION};\
	done
