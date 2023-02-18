require recipes-core/images/core-image-minimal.bb

SUMMARY = "Smartsite Image"
DESCRIPTION = "A custom image for Smartsite platform"
PR = "r1"

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

# cgroup-lite
IMAGE_INSTALL += "nano aziot-edged"
 
IMAGE_ROOTFS_SIZE = "2000000"

EXTRA_IMAGE_FEATURES += "ssh-server-openssh"

CORE_IMAGE_EXTRA_INSTALL += "kernel-modules"
