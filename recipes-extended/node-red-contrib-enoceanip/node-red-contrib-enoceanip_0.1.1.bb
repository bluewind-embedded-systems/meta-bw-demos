SUMMARY = "I/O nodes for Node-RED to communicate with EnOcean REST API."
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3900837f23fdc8b551bf6ec461bd58de"

PACKAGE_ARCH = "all"

SRCREV = "781bfbbd31ced1b2cd55b90a0ecc44539329c03d"
SRC_URI = "git://github.com/Digital-Concepts/node-red-contrib-enoceanip.git"

S = "${WORKDIR}/git"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"

RDEPENDS_${PN} += " node-red"
