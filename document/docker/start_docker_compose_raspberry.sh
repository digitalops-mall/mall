#!/usr/bin/env bash
sudo rm -rf /mydata/mongo/db/mongod.lock
sudo docker-compose -f docker-compose-raspberry-env.yml up -d
