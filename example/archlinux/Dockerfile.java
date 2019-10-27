FROM nicfit/archlinux-base:local
MAINTAINER <nicfit@gmail.com>

RUN pacman -Syu --noconfirm --needed \
                jre-openjdk