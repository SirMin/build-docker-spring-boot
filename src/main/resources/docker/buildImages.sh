#!/usr/bin/env bash
docker build -t ${image.repository}/${image.name}:${image.Version} .
