ARG TAG=local
FROM nicfit/alpine-base:${TAG}
MAINTAINER <nicfit@gmail.com>

RUN apk add --no-cache\
            openjdk8-jre
