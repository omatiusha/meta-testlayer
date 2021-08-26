SUMMARY = "hello"

IMAGE_INSTALL += "hello"
IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

#ROOTFS_POSTPROCESS_COMMAND += " remove_packaging_data_files ; "

