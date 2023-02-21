require recipes-core/images/core-image-minimal.bb

SUMMARY = "Smartsite Image"
DESCRIPTION = "A custom image for Smartsite platform"
PR = "r1"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=a3cf78761a26fb2c850aec855708e83f808617c0c9c4620db58f06cbd2ce4d36"

# cgroup-lite
IMAGE_INSTALL += "nano aziot-edged"
 
IMAGE_ROOTFS_SIZE = "2000000"

EXTRA_IMAGE_FEATURES += "ssh-server-openssh"

CORE_IMAGE_EXTRA_INSTALL += "kernel-modules"
