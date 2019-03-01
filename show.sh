#!/bin/bash

cd /root/douyu----------------------video3

#source ~/.bash_profile


while true
  do
        for element in `ls *.mp4 $1`
    do
        dir_or_file=$element

        echo $dir_or_file
        url=`cat 1.txt`

        ffmpeg -re -i  "$dir_or_file" -vcodec copy -acodec aac -b:a 192k \
        -strict -2 -f flv $url


    done
  done
