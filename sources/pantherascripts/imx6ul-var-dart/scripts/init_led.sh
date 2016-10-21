#! /bin/sh

echo 119 > /sys/class/gpio/export
echo "out" > /sys/class/gpio/gpio119/direction


