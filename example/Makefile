
Makefile.docker:
	ln -s ../Makefile.docker

build: Makefile.docker alpine arch

alpine:
	${MAKE} -C ./alpine build

arch:
	${MAKE} -C ./archlinux build


publish:
	${MAKE} -C ./alpine publish
	${MAKE} -C ./archlinux publish
