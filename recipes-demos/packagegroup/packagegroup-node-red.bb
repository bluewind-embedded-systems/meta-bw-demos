# Copyright (C) 2016 Bluewind srl
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for node-red"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
    nodejs-npm \
    node-red \
    node-red-contrib-protobuffersnode \
    node-red-contrib-enocean-serial \
  "
