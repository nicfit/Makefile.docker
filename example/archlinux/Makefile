include ../Makefile.docker

bash: start
	docker-compose exec nicfit-archlinux bash


publish: build
	for img in archlinux-base archlinux-python archlinux-java archlinux-devel archlinux; do \
		docker tag nicfit/$${img}:latest nicfit/$${img}:${VERSION};\
		docker push nicfit/$${img}:${VERSION};\
	done
