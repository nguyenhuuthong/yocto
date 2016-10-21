#! /bin/sh

while true
do
    echo 0 > /sys/class/gpio/gpio119/value
    sleep 1
    echo 1 > /sys/class/gpio/gpio119/value
    sleep 1
done

