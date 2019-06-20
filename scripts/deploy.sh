#!/usr/bin/env bash

PROJECT_ROOT="$(dirname "$0")/.."

cd ${PROJECT_ROOT} &&

openssl aes-256-cbc -K $encrypted_1d787f3de7c3_key -iv $encrypted_1d787f3de7c3_iv -in pubring.gpg.enc -out pubring.gpg -d &&

./gradlew uploadArchives &&

./gradlew closeAndReleaseRepository
