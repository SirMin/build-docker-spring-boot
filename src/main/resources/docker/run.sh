#!/usr/bin/env bash
docker run -p ${host.port}:${server.port} -t ${image.repository}/${image.name}:${image.Version}