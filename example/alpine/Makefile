include ../Makefile.docker


bash: start
	docker-compose exec nicfit-alpine bash


publish: _check-version-nonlocal build
	for img in alpine-base alpine-python alpine-java alpine-devel alpine; do \
		docker push nicfit/$${img}:${TAG};\
	done
