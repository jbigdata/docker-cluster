FROM node:4-onbuild
MAINTAINER Liang Wan <wan_liang@126.com>

ENV DOCKER_HOST unix:///var/run/docker.sock

# Install app dependencies
COPY package.json /src/package.json
RUN cd /src; npm install

# Bundle app source
COPY . /src

# Expose Port

EXPOSE 3000
CMD ["node","/src/server.js"]
