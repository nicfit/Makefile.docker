FROM nicfit/archlinux-base:latest
MAINTAINER <nicfit@gmail.com>

RUN pacman -Syu --noconfirm --needed \
                jre-openjdk