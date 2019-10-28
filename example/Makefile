VERSION ?= local

all: Makefile.docker build

Makefile.docker:
	ln -s ../Makefile.docker

build: Makefile.docker alpine arch

alpine:
	${MAKE} -C ./alpine VERSION=${VERSION} build

arch:
	${MAKE} -C ./archlinux VERSION=${VERSION} build


publish:
	${MAKE} -C ./alpine VERSION=${VERSION} publish
	${MAKE} -C ./archlinux VERSION=${VERSION} publish

.PHONY: all build alpine arch publish
