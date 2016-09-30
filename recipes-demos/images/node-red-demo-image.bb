DESCRIPTION = "node-red image"
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_INSTALL += " \
    ${CORE_IMAGE_BASE_INSTALL} \
"

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    nfs-server \
    tools-debug \
    tools-profile \
    ssh-server-dropbear \
    "

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-node-red \
    packagegroup-core-full-cmdline \
"
