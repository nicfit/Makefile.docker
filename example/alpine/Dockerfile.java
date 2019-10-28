ARG VERSION=local
FROM nicfit/alpine-base:${VERSION}
MAINTAINER <nicfit@gmail.com>

RUN apk add --no-cache openjdk8-jre
