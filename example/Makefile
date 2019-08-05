Makefile.docker:
	ln -s ../Makefile.docker

build: Makefile.docker
	${MAKE} -C ./alpine build
	${MAKE} -C ./archlinux build
