#!/usr/bin/env bash

JITPACK_ACCESS_TOKEN=$1
TRAVIS_TAG=$2
GROUP_ID="org.algorithm-visualizer"
ARTIFACT_ID="tracers.java"
MAX_RETRIES=42
INTERVAL=5

# Remove the artifact of the same version if it already exists
curl -u${JITPACK_ACCESS_TOKEN}: -X DELETE "https://jitpack.io/api/builds/${GROUP_ID}/${ARTIFACT_ID}/${TRAVIS_TAG}"

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
