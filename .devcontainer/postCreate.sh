#!/bin/bash

set -e

echo "Updating packages..."
sudo apt-get update

echo "Installing Maven..."
sudo apt-get install -y maven

echo "Installing Git LFS..."
sudo apt-get install -y git-lfs
git lfs install

echo "Installing Chromium..."
sudo apt-get install -y chromium chromium-driver

echo ""
echo "========================================"
echo "Installed Software"
echo "========================================"

java -version
mvn -version
git lfs version

which chromium
chromium --version

which chromedriver
chromedriver --version

echo ""
echo "Environment setup complete."