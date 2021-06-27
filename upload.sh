#!/bin/bash
sftp ubuntu@150.158.171.212<<EOF
put /Users/apple/Downloads/demo-2/target.zip 
quit
ssh ubuntu@150.158.171.212<<EOF
rm -rf target
rm -rf __MACOSX
unzip target.zip
java -jar target/demo-0.0.1-SNAPSHOT.jar &
echo "hi"
