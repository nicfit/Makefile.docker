TAG ?= local

all: Makefile.docker build

Makefile.docker:
	ln -s ../Makefile.docker

build: Makefile.docker alpine arch

alpine:
	${MAKE} -C ./alpine TAG=${TAG} build

arch:
	${MAKE} -C ./archlinux TAG=${TAG} build


publish:
	${MAKE} -C ./alpine TAG=${TAG} publish
	${MAKE} -C ./archlinux TAG=${TAG} publish

.PHONY: all build alpine arch publish
