#!/usr/bin/env bash

TRAVIS_TAG=$1
TRAVIS_ACCESS_TOKEN=$2
GITHUB_USER="algorithm-visualizer"
GITHUB_REPO="extractor.java"

BODY="{
  \"request\": {
    \"branch\": \"master\",
    \"config\": {
      \"env\": {
        \"TRACERS_VERSION\": \"${TRAVIS_TAG}\"
      }
    }
  }
}"

STATUS_CODE=$(curl -s -o /dev/stderr -w "%{http_code}" -X POST \
  -H "Content-Type: application/json" \
  -H "Accept: application/json" \
  -H "Travis-API-Version: 3" \
  -H "Authorization: token ${TRAVIS_ACCESS_TOKEN}" \
  -d "${BODY}" \
  "https://api.travis-ci.com/repo/${GITHUB_USER}%2F${GITHUB_REPO}/requests")

if [[ ${STATUS_CODE} != 2* ]]; then
    exit 1
fi
