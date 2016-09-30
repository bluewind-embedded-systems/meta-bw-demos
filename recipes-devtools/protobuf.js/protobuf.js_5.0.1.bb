SUMMARY = "Protocol Buffers for JavaScript."
HOMEPAGE = "http://dcode.io"
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/dcodeIO/protobuf.js/archive/${PV}.tar.gz"

SRC_URI[md5sum] = "53b3e5999072d84275427856d4e2f9de"
SRC_URI[sha256sum] = "b350180ba02e3dcc0cf9c3d20e9ecb9654f83aecd3e0b43b8a2e76ad3dba0979"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"
