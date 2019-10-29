include ../Makefile.docker


bash: start
	docker-compose exec nicfit-archlinux bash


publish: _check-version-nonlocal build
	for img in archlinux-base archlinux-python archlinux-java archlinux-devel archlinux; do \
		docker push nicfit/$${img}:${TAG};\
	done
