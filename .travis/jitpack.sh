#!/usr/bin/env bash

TRAVIS_TAG=$1
MAX_RETRIES=42
INTERVAL=5

for (( i=1; i<=MAX_RETRIES; ++i)); do
  STATUS_CODE=$(curl -s -o /dev/stderr -w "%{http_code}" \
    -H "Content-Type: application/json" \
    -H "Accept: application/json" \
    -H "Travis-API-Version: 3" \
    "https://jitpack.io/org/algorithm-visualizer/tracers.java/${TRAVIS_TAG}/tracers.java-${TRAVIS_TAG}.pom")
  if [[ ${STATUS_CODE} == 2* ]]; then
    exit 0
  fi
  echo " (${i}/${MAX_RETRIES})"
  if [[ ${i} < ${MAX_RETRIES} ]]; then
    sleep ${INTERVAL}
  fi
done
exit 1
