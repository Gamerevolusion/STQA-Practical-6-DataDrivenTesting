#!/bin/bash

set -e

sudo apt-get update

sudo apt-get install -y chromium chromium-driver

echo "--------------------------------"
echo "Chromium Installation Complete"
echo "--------------------------------"

which chromium || true
which chromedriver || true

chromium --version || true
chromedriver --version || true