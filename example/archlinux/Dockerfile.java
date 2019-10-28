ARG VERSION=local
FROM nicfit/archlinux-base:${VERSION}
MAINTAINER <nicfit@gmail.com>

RUN pacman -Syu --noconfirm --needed \
                jre-openjdk